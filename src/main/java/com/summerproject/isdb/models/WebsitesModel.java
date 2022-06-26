package com.summerproject.isdb.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table (name = "websites")
@Data
public class WebsitesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;

    @Column(name = "url")
    String url;

    @Column(name = "scam_percentage")
    double scam_percentage;

    @Column(name = "domain_name")
    String domain_name;

    @Column(name = "website_name")
    String website_name;

    @Column(name = "similar_domain")
    String similar_domain;

    @Column(name = "virus_scan")
    String virus_scan;

    @Column(name = "redirected")
    String redirected;

    @Column(name = "secure")
    String secure;

    @Column(name = "num_reports")
    Integer num_reports;

    @Column(name = "linked_in_emps")
    String linked_in_emps;

    @Column(name = "age")
    String age;

    public WebsitesModel(int id, String url, double scam_percentage, String domain_name,
                         String website_name, String similar_domain, String virus_scan, String redirected,
                         String secure, Integer num_reports, String linkedIn_emps, String age) {
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
        this.linked_in_emps = linkedIn_emps;
        this.age = age;
    }

    public WebsitesModel() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getScam_percentage() {
        return scam_percentage;
    }

    public void setScam_percentage(double scam_percentage) {
        this.scam_percentage = scam_percentage;
    }

    public String getDomain_name() {
        return domain_name;
    }

    public void setDomain_name(String domain_name) {
        this.domain_name = domain_name;
    }

    public String getWebsite_name() {
        return website_name;
    }

    public void setWebsite_name(String website_name) {
        this.website_name = website_name;
    }

    public String getSimilar_domain() {
        return similar_domain;
    }

    public void setSimilar_domain(String similar_domain) {
        this.similar_domain = similar_domain;
    }

    public String getVirus_scan() {
        return virus_scan;
    }

    public void setVirus_scan(String virus_scan) {
        this.virus_scan = virus_scan;
    }

    public String getRedirected() {
        return redirected;
    }

    public void setRedirected(String redirected) {
        this.redirected = redirected;
    }

    public String getSecure() {
        return secure;
    }

    public void setSecure(String secure) {
        this.secure = secure;
    }

    public Integer getNum_reports() {
        return num_reports;
    }

    public void setNum_reports(Integer num_reports) {
        this.num_reports = num_reports;
    }

    public String getLinkedIn_emps() {
        return linked_in_emps;
    }

    public void setLinkedIn_emps(String linked_in_emps) {
        this.linked_in_emps = linked_in_emps;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
