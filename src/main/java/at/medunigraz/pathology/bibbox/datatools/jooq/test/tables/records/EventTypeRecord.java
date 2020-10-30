/*
 * This file is generated by jOOQ.
 */
package at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.records;


import at.medunigraz.pathology.bibbox.datatools.jooq.test.tables.EventType;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class EventTypeRecord extends UpdatableRecordImpl<EventTypeRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -1049913734;

    /**
     * Setter for <code>test.event_type.event_type_id</code>.
     */
    public void setEventTypeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.event_type.event_type_id</code>.
     */
    public Integer getEventTypeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.event_type.event_type</code>.
     */
    public void setEventType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.event_type.event_type</code>.
     */
    public String getEventType() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EventType.EVENT_TYPE.EVENT_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EventType.EVENT_TYPE.EVENT_TYPE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getEventTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getEventType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEventTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEventType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventTypeRecord value1(Integer value) {
        setEventTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventTypeRecord value2(String value) {
        setEventType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventTypeRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventTypeRecord
     */
    public EventTypeRecord() {
        super(EventType.EVENT_TYPE);
    }

    /**
     * Create a detached, initialised EventTypeRecord
     */
    public EventTypeRecord(Integer eventTypeId, String eventType) {
        super(EventType.EVENT_TYPE);

        set(0, eventTypeId);
        set(1, eventType);
    }
}