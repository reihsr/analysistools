package at.medunigraz.pathology.bibbox.datatools.prostate;

import java.sql.*;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.pipeline.*;

public class ExtractSamenblasenInvationInformation {
    private String pg_url = "jdbc:postgresql://127.0.0.1:5432/saat";
    private String pg_user = "saat";
    private String pg_password = "fenris";

    private Statement insert_statement;

    private StanfordCoreNLP pipeline;

    Pattern pattern = Pattern.compile("[\\s*|\\w*|,|\\(|\\)]*SAMEN\\w*[\\s*|\\w*|,|\\(|\\)]*", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);

    private String query = "SELECT cases.vhistonumberid vhistonumberid, MAX(\"DIAGNOSE1\") diagnosis, MAX(\"MAKROSKOPISCHEBESCHREIBUNG1\") makroskopischebeschreibung, " +
            "MAX(\"HISTOLOGISCHEBESCHREIBUNG1\") histologischebeschreibung " +
            ", MAX(\"MIKROSKOPISCHEBESCHREIBUNG1\") mikroskopischebeschreibung, MAX(\"SCHNELLSCHNITTDIAGNOSE1\") schnellschnittdiagnose, befund.id bid " +
            "FROM scannerwebserviceproductive.scantable scan " +
            "JOIN scannerwebserviceproductive.slidetable slide ON scan.slidebarcode = slide.slidebarcode " +
            "JOIN scannerwebserviceproductive.histonumbervhistonumbermap hito ON hito.histonumber_fk = slide.slidehistonumber " +
            "JOIN scannerwebserviceproductive.casetable cases ON cases.vhistonumberid = hito.vhistonumberid_fk " +
            "JOIN prostate.xml_report_befunddaten befund ON befund.\"VHISTID1_ext\" = cases.vhistonumberid " +
            //"WHERE \"MAKROSKOPISCHEBESCHREIBUNG1\" ILIKE '%SAMEN%' OR " +
            //"\t\"HISTOLOGISCHEBESCHREIBUNG1\" ILIKE '%SAMEN%' OR " +
            //"\t\"MIKROSKOPISCHEBESCHREIBUNG1\" ILIKE '%SAMEN%' OR " +
            //"\t\"SCHNELLSCHNITTDIAGNOSE1\" ILIKE '%SAMEN%' OR " +
            //"\t\"DIAGNOSE1\" ILIKE '%SAMEN%' " +
            "GROUP BY cases.vhistonumberid, befund.id;";

    private String query2 = "SELECT \"DIAGNOSE1\" diagnosis, \"MAKROSKOPISCHEBESCHREIBUNG1\" makroskopischebeschreibung, " +
            "\"HISTOLOGISCHEBESCHREIBUNG1\" histologischebeschreibung " +
            ", \"MIKROSKOPISCHEBESCHREIBUNG1\" mikroskopischebeschreibung, \"SCHNELLSCHNITTDIAGNOSE1\" schnellschnittdiagnose, id bid " +
            "FROM prostate.xml_report_befunddaten;";


    public void extractInformation() {
        initializeTokeniza();


        try(Connection connection = DriverManager.getConnection(pg_url, pg_user, pg_password)) {
            Statement statement = connection.createStatement();
            insert_statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query2);
            workExtraction(resultSet);
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }

    /*
    https://stanfordnlp.github.io/CoreNLP/ssplit.html
     */
    private void initializeTokeniza() {
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize,ssplit,pos,lemma");
        props.setProperty("tokenize.options", "splitHyphenated=false,americanize=false");
        props.setProperty("tokenize.language", "German");
        props.setProperty("ssplit.newlineIsSentenceBreak", "two");
        //props.setProperty("pos.model", "edu/stanford/nlp/models/pos-tagger/english-left3words/english-left3words-distsim.tagger");
        props.setProperty("pos.model", "edu/stanford/nlp/models/pos-tagger/german-ud.tagger");
        pipeline = new StanfordCoreNLP(props);
    }

    private void workExtraction(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            //Long id = resultSet.getLong("vhistonumberid");
            Long befundId = resultSet.getLong("bid");
            String diagnosis = resultSet.getString("diagnosis").replaceAll("[\\t\\n\\r]+", " ");
            String makroskopischebeschreibung = resultSet.getString("makroskopischebeschreibung");
            String histologischebeschreibung = resultSet.getString("histologischebeschreibung");
            String mikroskopischebeschreibung = resultSet.getString("mikroskopischebeschreibung");
            String schnellschnittdiagnose = resultSet.getString("schnellschnittdiagnose");

            System.out.println("-----------------");
            //System.out.println(id);
            //System.out.println(diagnosis);
            /*
            matchDataString(diagnosis, "diagnosis", befundId);
            matchDataString(makroskopischebeschreibung, "makroskopischebeschreibung", befundId);
            matchDataString(histologischebeschreibung, "histologischebeschreibung", befundId);
            matchDataString(mikroskopischebeschreibung, "mikroskopischebeschreibung", befundId);
            matchDataString(schnellschnittdiagnose, "schnellschnittdiagnose", befundId);
            */
            tokenizeDiagnosis(resultSet.getString("diagnosis"), befundId, "diagnosis");
            tokenizeDiagnosis(makroskopischebeschreibung, befundId, "makroskopischebeschreibung");
            tokenizeDiagnosis(histologischebeschreibung, befundId, "histologischebeschreibung");
            tokenizeDiagnosis(mikroskopischebeschreibung, befundId, "mikroskopischebeschreibung");
            tokenizeDiagnosis(schnellschnittdiagnose, befundId, "schnellschnittdiagnose");
        }
    }

    String sourcetable = "prostate.xml_report_befunddaten";

    private void tokenizeDiagnosis(String text, Long befundId, String field) {
        CoreDocument doc = new CoreDocument(text);
        pipeline.annotate(doc);


        System.out.println("----------------------------");
        System.out.println(text);

        int sent_counter = 0;
        Long sentencId = 0L;

        for (CoreSentence sent : doc.sentences()) {
            System.out.println("->" + sent.text());

            sentencId = insertSentenceSAAT(sourcetable, befundId, sent.charOffsets().first(), sent.charOffsets().second(), sent.text(), field);
            sent_counter++;
        }

        for (CoreLabel tok : doc.tokens()) {
            /*System.out.println("++++++++++");
            System.out.println(String.format("%s\t%d\t%d", tok.word(), tok.beginPosition(), tok.endPosition()));
            System.out.println(tok.sentIndex());
            System.out.println(tok.category());
            System.out.println(tok.lemma());
            System.out.println(tok.originalText());
            System.out.println(tok.tag());
            System.out.println(tok.value());*/
            Long tokenId = insertTokenSAAT(tok.word(), tok.category(), tok.lemma(), tok.tag(), tok.sentIndex(), tok.beginPosition(), tok.endPosition(), field);
            insertSentenceTokenLinkSAAT(sentencId, tokenId);
        }
        System.out.println("#####");
    }

    /*
    CREATE TABLE saat_token.sentence
(
    sentence_id bigserial NOT NULL,
	source character varying,
    source_id bigint,
    index_start integer,
    index_end integer,
    sentence text,
    field character varying,
    CONSTRAINT sentence_pkey PRIMARY KEY (sentence_id)
)

TABLESPACE pg_default;

ALTER TABLE saat_token.sentence
    OWNER to postgres;


-- Table: saat_token.svi_sentence_svi_token_link

-- DROP TABLE saat_token.svi_sentence_svi_token_link;

CREATE TABLE saat_token.sentence_token_link
(
    sentence_id bigint,
    token_id bigint
)

TABLESPACE pg_default;

ALTER TABLE saat_token.sentence_token_link
    OWNER to postgres;




-- Table: saat_token.svi_token

-- DROP TABLE saat_token.svi_token;

CREATE TABLE saat_token.token
(
    token_id bigserial NOT NULL,
    token character varying,
    category character varying,
    lemma character varying,
    tag character varying,
	sentence_count integer,
	begin_position integer,
	end_position integer,
	field character varying,
    CONSTRAINT token_pkey PRIMARY KEY (token_id)
)

TABLESPACE pg_default;

ALTER TABLE saat_token.token
    OWNER to postgres;
     */

    private Long insertSentenceSAAT(String source, Long befundId, Integer startIndex, Integer endIndex, String sentence, String field) {
        ResultSet rs = null;
        try {
            rs = insert_statement.executeQuery("INSERT INTO saat_token.sentence(source, source_id, index_start, index_end, sentence, field) VALUES ('" + source + "', " +
                    befundId + ", " + startIndex + ", " + endIndex + ", $$" + sentence + "$$, '" + field + "'" +
                    ") RETURNING sentence_id");
            rs.next();
            return rs.getLong(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0L;
    }

    private Long insertTokenSAAT(String token, String category, String lemma, String tag, Integer sentence_count, Integer begin_position, Integer end_position, String field) {
        try {
            ResultSet rs = insert_statement.executeQuery("INSERT INTO saat_token.token(token, category, lemma, tag, sentence_count, begin_position, end_position, field) VALUES " +
                    "($$" + token + "$$, $$" + category  + "$$, $$"+ lemma + "$$, $$" + tag + "$$, " + sentence_count + "," + begin_position + "," + end_position + ", '" + field + "') RETURNING token_id;");
            rs.next();
            return rs.getLong(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0L;
    }

    private void insertSentenceTokenLinkSAAT(Long sentencId, Long tokenId) {
        try {
            insert_statement.execute("INSERT INTO saat_token.sentence_token_link(sentence_id, token_id) VALUES (" + sentencId + "," + tokenId + ");");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void matchDataString(String datastirng, String field, Long befundId) {
        Matcher matcher = pattern.matcher(datastirng);
        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.print(matcher.group());
            System.out.println(" --> " + extractInfromation(matcher.group()));
            Integer svisId = insertSentence(befundId, matcher.start(), matcher.end(), matcher.group(), field);
            tokenize(matcher.group(), svisId);
        }
    }

    private void tokenize(String sentence, Integer svisId) {
        CoreDocument doc = new CoreDocument(sentence);
        pipeline.annotate(doc);
        for (CoreLabel tok : doc.tokens()) {
            System.out.println(String.format("%s\t%d\t%d", tok.word(), tok.beginPosition(), tok.endPosition()));
            //System.out.println(tok.category());
            //System.out.println(tok.lemma());
            //System.out.println(tok.originalText());
            //System.out.println(tok.tag());
            //System.out.println(tok.value());

            String token = tok.word();
            Integer svi_token_id = insertToken(token, tok.category(), tok.lemma(), tok.tag());
            insertSentenceTokenLink(svisId, svi_token_id);
        }
    }

    private Integer insertSentence(Long befundId, Integer startIndex, Integer endIndex, String sentence, String field) {
        ResultSet rs = null;
        try {
            rs = insert_statement.executeQuery("INSERT INTO prostate_saat.svi_sentence(befund_id, index_start, index_end, sentence, field) VALUES (" +
                    befundId + ", " + startIndex + ", " + endIndex + ", $$" + sentence + "$$, '" + field + "'" +
                    ") RETURNING svi_sentence_id");
            rs.next();
            return rs.getInt(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    private Integer insertToken(String token, String category, String lemma, String tag) {
        try {
            ResultSet rs = insert_statement.executeQuery("INSERT INTO prostate_saat.svi_token(token, category, lemma, tag) VALUES " +
                    "($$" + token + "$$, $$" + category  + "$$, $$"+ lemma + "$$, $$" + tag + "$$) RETURNING svi_token_id;");
            rs.next();
            return rs.getInt(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    private void insertSentenceTokenLink(Integer svisId, Integer svi_token_id) {
        try {
            insert_statement.execute("INSERT INTO prostate_saat.svi_sentence_svi_token_link(svi_sentence_id, svi_token_id) VALUES (" + svisId + "," + svi_token_id + ");");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private String NEGATIV = "negativ";
    private String POSITIV = "positiv";

    private String extractInfromation(String text) {
        if(text.matches("SAMENBLASEN (\\w*)? ?(\\w*)? ?TUMORFREI")) {
            return NEGATIV;
        } else if(text.matches("TUMORFREI SAMENBLASEN")) {
            return NEGATIV;
        } else if(text.matches("INFILTRATION SAMENBLASEN")) {
            return POSITIV;
        } else if(text.matches("SAMENBLASEN (\\w*)? ?(\\w*)? ?INFILTRATION")) {
            return POSITIV;
        }
        return "NOT-SET";
    }
}
