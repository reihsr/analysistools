/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in xxx20200705_scannerwebserviceproductive
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>xxx20200705_scannerwebserviceproductive.googlejsonuploadid_seq</code>
     */
    public static final Sequence<Long> GOOGLEJSONUPLOADID_SEQ = new SequenceImpl<Long>("googlejsonuploadid_seq", Xxx20200705Scannerwebserviceproductive.XXX20200705_SCANNERWEBSERVICEPRODUCTIVE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>xxx20200705_scannerwebserviceproductive.googleslideuploadid_seq</code>
     */
    public static final Sequence<Long> GOOGLESLIDEUPLOADID_SEQ = new SequenceImpl<Long>("googleslideuploadid_seq", Xxx20200705Scannerwebserviceproductive.XXX20200705_SCANNERWEBSERVICEPRODUCTIVE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>xxx20200705_scannerwebserviceproductive.inboxid_seq</code>
     */
    public static final Sequence<Long> INBOXID_SEQ = new SequenceImpl<Long>("inboxid_seq", Xxx20200705Scannerwebserviceproductive.XXX20200705_SCANNERWEBSERVICEPRODUCTIVE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}