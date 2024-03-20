package com.teamc.fms.model;

import java.sql.Timestamp;

public class TimeSlot {
    private Integer id;

    public TimeSlot() {
    }

    public TimeSlot(Integer id, Timestamp start_hour, Timestamp end_hour, String facility_id) {
        this.id = id;
        this.start_hour = start_hour;
        this.end_hour = end_hour;
        this.facility_id = facility_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getStart_hour() {
        return start_hour;
    }

    public void setStart_hour(Timestamp start_hour) {
        this.start_hour = start_hour;
    }

    public Timestamp getEnd_hour() {
        return end_hour;
    }

    public void setEnd_hour(Timestamp end_hour) {
        this.end_hour = end_hour;
    }

    public String getFacility_id() {
        return facility_id;
    }

    public void setFacility_id(String facility_id) {
        this.facility_id = facility_id;
    }

    private Timestamp start_hour;
    private Timestamp end_hour;
    private String facility_id;

}
