package com.summerproject.isdb.models;

import javax.persistence.*;

@Entity
@Table(name="scam_report")
public class ScamReportModel {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name="id")
    Integer id;

    @Column (name="user_type")
    Integer user_type;

    @Column (name="url")
    Integer url;

    @Column (name="domain_name")
    Integer domain_name;

    @Column (name="report")
    Integer report;

    @Column (name="user_user_id")
    Integer user_user_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_type() {
        return user_type;
    }

    public void setUser_type(Integer user_type) {
        this.user_type = user_type;
    }

    public Integer getUrl() {
        return url;
    }

    public void setUrl(Integer url) {
        this.url = url;
    }

    public Integer getDomain_name() {
        return domain_name;
    }

    public void setDomain_name(Integer domain_name) {
        this.domain_name = domain_name;
    }

    public Integer getReport() {
        return report;
    }

    public void setReport(Integer report) {
        this.report = report;
    }

    public Integer getUser_user_id() {
        return user_user_id;
    }

    public void setUser_user_id(Integer user_user_id) {
        this.user_user_id = user_user_id;
    }
}
