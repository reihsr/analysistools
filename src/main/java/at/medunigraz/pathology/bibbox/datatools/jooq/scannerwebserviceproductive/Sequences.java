/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.scannerwebserviceproductive;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in scannerwebserviceproductive
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
     * The sequence <code>scannerwebserviceproductive.googlejsonuploadid_seq</code>
     */
    public static final Sequence<Long> GOOGLEJSONUPLOADID_SEQ = new SequenceImpl<Long>("googlejsonuploadid_seq", Scannerwebserviceproductive.SCANNERWEBSERVICEPRODUCTIVE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>scannerwebserviceproductive.googleslideuploadid_seq</code>
     */
    public static final Sequence<Long> GOOGLESLIDEUPLOADID_SEQ = new SequenceImpl<Long>("googleslideuploadid_seq", Scannerwebserviceproductive.SCANNERWEBSERVICEPRODUCTIVE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>scannerwebserviceproductive.inboxid_seq</code>
     */
    public static final Sequence<Long> INBOXID_SEQ = new SequenceImpl<Long>("inboxid_seq", Scannerwebserviceproductive.SCANNERWEBSERVICEPRODUCTIVE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
