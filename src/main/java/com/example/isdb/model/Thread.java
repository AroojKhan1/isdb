package com.example.isdb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Collection;
import java.util.Set;


@Entity
@Table(name = "thread")
public class Thread {
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





    @ManyToOne
    @JoinColumn(name="post_id",nullable = false)
    private Post post;

    public Thread() {

    }


}
