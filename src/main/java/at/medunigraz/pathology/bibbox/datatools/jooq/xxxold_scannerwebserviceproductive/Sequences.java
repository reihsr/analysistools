/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxxold_scannerwebserviceproductive;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in xxxold_scannerwebserviceproductive
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
     * The sequence <code>xxxold_scannerwebserviceproductive.casetable_tmpid_seq</code>
     */
    public static final Sequence<Long> CASETABLE_TMPID_SEQ = new SequenceImpl<Long>("casetable_tmpid_seq", XxxoldScannerwebserviceproductive.XXXOLD_SCANNERWEBSERVICEPRODUCTIVE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>xxxold_scannerwebserviceproductive.googleslideuploadid</code>
     */
    public static final Sequence<Long> GOOGLESLIDEUPLOADID = new SequenceImpl<Long>("googleslideuploadid", XxxoldScannerwebserviceproductive.XXXOLD_SCANNERWEBSERVICEPRODUCTIVE, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
