package com.example.isdb.model;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name = "scam_report")
public class ScamReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name="user_type")
    private String user_type;

    @Column (name="url")
    private String url;

    @Column (name="domain_name")
    private String domain_name;

    @Column (name="report")
    private String report;

    @Column (name="user_user_id")
    private String user_user_id;


    private Collection <Website> reported_websites;
}
