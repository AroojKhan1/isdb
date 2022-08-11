package com.example.isdb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
//import java.sql.Date;
//import java.sql.Time;
import java.sql.Time;
import java.util.Date;


import java.util.Set;


@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id")
    private long user_id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;


    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "date")
    private Date date;


//    @Temporal(TemporalType.TIME)
//    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @Column(name = "time")
    private Time time;



//    private Time currentTime;


//
//    @Column (name="user_type")
//    private String user_type;


    //    @Column(name = "current_date")
//    @Temporal(TemporalType.TIMESTAMP)
//    private java.util.Date current_date;
    @OneToMany(mappedBy = "post")
    private Set<Thread> threads;

    public Post() {

    }

    public Post(long id, long user_id, String title, String content, Date date, Time time, Set<Thread> threads) {
        this.id = id;
        this.user_id = user_id;
        this.title = title;
        this.content = content;
        this.date = date;
        this.time = time;
        this.threads = threads;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public Set<Thread> getThreads() {
        return threads;
    }

    public void setThreads(Set<Thread> threads) {
        this.threads = threads;
    }
}
