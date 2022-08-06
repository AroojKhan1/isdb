package com.example.isdb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
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


    @Column(name = "date")
    private Date date_time;


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


}
