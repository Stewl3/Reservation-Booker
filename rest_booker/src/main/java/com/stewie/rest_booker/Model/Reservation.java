package com.stewie.rest_booker.Model;

import java.sql.Time;
import java.util.Date;

public class Reservation {

    private int id;
    private String name;
    private String email;
    private Date date;
    private Time time;

    public Reservation() {
    }

    public Reservation(String name, String email, Date date, Time time) {
        this.name = name;
        this.email = email;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
    

