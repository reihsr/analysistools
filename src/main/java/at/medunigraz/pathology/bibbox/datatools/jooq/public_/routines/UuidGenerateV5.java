/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.public_.routines;


import at.medunigraz.pathology.bibbox.datatools.jooq.public_.Public;

import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UuidGenerateV5 extends AbstractRoutine<UUID> {

    private static final long serialVersionUID = 1893368010;

    /**
     * The parameter <code>public.uuid_generate_v5.RETURN_VALUE</code>.
     */
    public static final Parameter<UUID> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.UUID, false, false);

    /**
     * The parameter <code>public.uuid_generate_v5.namespace</code>.
     */
    public static final Parameter<UUID> NAMESPACE = Internal.createParameter("namespace", org.jooq.impl.SQLDataType.UUID, false, false);

    /**
     * The parameter <code>public.uuid_generate_v5.name</code>.
     */
    public static final Parameter<String> NAME = Internal.createParameter("name", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public UuidGenerateV5() {
        super("uuid_generate_v5", Public.PUBLIC, org.jooq.impl.SQLDataType.UUID);

        setReturnParameter(RETURN_VALUE);
        addInParameter(NAMESPACE);
        addInParameter(NAME);
    }

    /**
     * Set the <code>namespace</code> parameter IN value to the routine
     */
    public void setNamespace(UUID value) {
        setValue(NAMESPACE, value);
    }

    /**
     * Set the <code>namespace</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNamespace(Field<UUID> field) {
        setField(NAMESPACE, field);
    }

    /**
     * Set the <code>name</code> parameter IN value to the routine
     */
    public void setName_(String value) {
        setValue(NAME, value);
    }

    /**
     * Set the <code>name</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setName_(Field<String> field) {
        setField(NAME, field);
    }
}
