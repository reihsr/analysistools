/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.xxx20200705_scannerwebserviceproductive.tables.Typetable;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


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
public class TypetableRecord extends TableRecordImpl<TypetableRecord> implements Record7<Integer, String, String, String, Boolean, String, String> {

    private static final long serialVersionUID = -1026474258;

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.typetable.typeid</code>.
     */
    public void setTypeid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.typetable.typeid</code>.
     */
    public Integer getTypeid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.typetable.typerex</code>.
     */
    public void setTyperex(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.typetable.typerex</code>.
     */
    public String getTyperex() {
        return (String) get(1);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.typetable.typeshortvalue</code>.
     */
    public void setTypeshortvalue(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.typetable.typeshortvalue</code>.
     */
    public String getTypeshortvalue() {
        return (String) get(2);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.typetable.typedescription</code>.
     */
    public void setTypedescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.typetable.typedescription</code>.
     */
    public String getTypedescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.typetable.typelisted</code>.
     */
    public void setTypelisted(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.typetable.typelisted</code>.
     */
    public Boolean getTypelisted() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.typetable.typelocalsisation</code>.
     */
    public void setTypelocalsisation(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.typetable.typelocalsisation</code>.
     */
    public String getTypelocalsisation() {
        return (String) get(5);
    }

    /**
     * Setter for <code>xxx20200705_scannerwebserviceproductive.typetable.typematerialembeded</code>.
     */
    public void setTypematerialembeded(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>xxx20200705_scannerwebserviceproductive.typetable.typematerialembeded</code>.
     */
    public String getTypematerialembeded() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, Boolean, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, Boolean, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Typetable.TYPETABLE.TYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Typetable.TYPETABLE.TYPEREX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Typetable.TYPETABLE.TYPESHORTVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Typetable.TYPETABLE.TYPEDESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return Typetable.TYPETABLE.TYPELISTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Typetable.TYPETABLE.TYPELOCALSISATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Typetable.TYPETABLE.TYPEMATERIALEMBEDED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getTypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTyperex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTypeshortvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTypedescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getTypelisted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTypelocalsisation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getTypematerialembeded();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTyperex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTypeshortvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTypedescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getTypelisted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTypelocalsisation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTypematerialembeded();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypetableRecord value1(Integer value) {
        setTypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypetableRecord value2(String value) {
        setTyperex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypetableRecord value3(String value) {
        setTypeshortvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypetableRecord value4(String value) {
        setTypedescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypetableRecord value5(Boolean value) {
        setTypelisted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypetableRecord value6(String value) {
        setTypelocalsisation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypetableRecord value7(String value) {
        setTypematerialembeded(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypetableRecord values(Integer value1, String value2, String value3, String value4, Boolean value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TypetableRecord
     */
    public TypetableRecord() {
        super(Typetable.TYPETABLE);
    }

    /**
     * Create a detached, initialised TypetableRecord
     */
    public TypetableRecord(Integer typeid, String typerex, String typeshortvalue, String typedescription, Boolean typelisted, String typelocalsisation, String typematerialembeded) {
        super(Typetable.TYPETABLE);

        set(0, typeid);
        set(1, typerex);
        set(2, typeshortvalue);
        set(3, typedescription);
        set(4, typelisted);
        set(5, typelocalsisation);
        set(6, typematerialembeded);
    }
}
