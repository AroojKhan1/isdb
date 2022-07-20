package com.example.isdb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name = "website")

public class Website {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "website_name")
    private String website_name;

    @Column(name = "url")
    private String url;

    @Column(name = "domain_name")
    private String domain_name;

    @Column(name = "scam_percentage")
    private double scam_percentage;

    @Column(name = "virus_scan")
    private String virus_scan;

    @Column(name = "similar_domain")
    private String similar_domain;


    @Column(name = "redirected")
    private String redirected;

    @Column(name = "secure")
    private String secure;

    @Column(name = "num_reports")
    private Integer num_reports;

    @Column(name = "linked_in_emps")
    private String linked_in_emps;

    @Column(name = "age")
    private String age;



    @ManyToMany
    @JoinTable(
            name="Scams_reported",
            joinColumns = @JoinColumn(name = "website_id"),
            inverseJoinColumns = @JoinColumn(name = "scam_report_id")
    )
    private Collection <ScamReport> reportedScams;

    public Website() {
    }

    public Website(Long id, String url, double scam_percentage, String domain_name, String website_name,
                   String similar_domain, String virus_scan, String redirected, String secure,
                   Integer num_reports, String linked_in_emps, String age) {
        this.id = id;
        this.url = url;
        this.scam_percentage = scam_percentage;
        this.domain_name = domain_name;
        this.website_name = website_name;
        this.similar_domain = similar_domain;
        this.virus_scan = virus_scan;
        this.redirected = redirected;
        this.secure = secure;
        this.num_reports = num_reports;
        this.linked_in_emps = linked_in_emps;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public double getScam_percentage() {
        return scam_percentage;
    }

    public String getDomain_name() {
        return domain_name;
    }

    public String getWebsite_name() {
        return website_name;
    }

    public String getSimilar_domain() {
        return similar_domain;
    }

    public String getVirus_scan() {
        return virus_scan;
    }

    public String getRedirected() {
        return redirected;
    }

    public String getSecure() {
        return secure;
    }

    public Integer getNum_reports() {
        return num_reports;
    }

    public String getLinked_in_emps() {
        return linked_in_emps;
    }

    public String getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setScam_percentage(double scam_percentage) {
        this.scam_percentage = scam_percentage;
    }

    public void setDomain_name(String domain_name) {
        this.domain_name = domain_name;
    }

    public void setWebsite_name(String website_name) {
        this.website_name = website_name;
    }

    public void setSimilar_domain(String similar_domain) {
        this.similar_domain = similar_domain;
    }

    public void setVirus_scan(String virus_scan) {
        this.virus_scan = virus_scan;
    }

    public void setRedirected(String redirected) {
        this.redirected = redirected;
    }

    public void setSecure(String secure) {
        this.secure = secure;
    }

    public void setNum_reports(Integer num_reports) {
        this.num_reports = num_reports;
    }

    public void setLinked_in_emps(String linked_in_emps) {
        this.linked_in_emps = linked_in_emps;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Collection<ScamReport> getScamReports() {
        return reportedScams;
    }

    public void setScamReports(Collection<ScamReport> scamReports) {
        this.reportedScams = scamReports;
    }
}
