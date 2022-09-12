package com.example.isdb.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;


@Entity
@Table(name = "thread")
public class Replies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "user_id")
    private long user_id;


    @Column (name="content")
    private String content;

    @Column(name = "date")
    private Date date_time;


    @Column(name = "time")
    private Time time;







    public Replies() {

    }

    public Replies(long id, long user_id, String content, Date date_time, Time time, Long post) {
        this.id = id;
        this.user_id = user_id;
        this.content = content;
        this.date_time = date_time;
        this.time = time;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate_time() {
        return date_time;
    }

    public void setDate_time(Date date_time) {
        this.date_time = date_time;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }


}
