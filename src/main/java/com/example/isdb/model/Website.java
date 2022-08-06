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

    @Column(name = "secure")
    private String secure;

    @Column(name = "num_reports")
    private Integer num_reports;

    @Column(name = "linked_in_emps")
    private String linked_in_emps;

    @Column(name = "age")
    private String age;

    @Column(name = "redirected")
    private String redirected;
    @Column(name = "similar_domain")
    private String similar_domain;

    @Column(name = "pop_ups")
    private String pop_ups;
    @Column(name = "ads")
    private String ads;
    @Column(name = "funky_ui")
    private String funky_ui;
    @Column(name = "flashy_images")
    private String flashy_images;
    @Column(name = "offers_gifts")
    private String offers_gifts;




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

    public Website(Long id, String website_name, String url, String domain_name, double scam_percentage,
                   String virus_scan, String secure, Integer num_reports, String linked_in_emps, String age,
                   String redirected, String similar_domain, String pop_ups, String ads, String funky_ui,
                   String flashy_images, String offers_gifts, Collection<ScamReport> reportedScams) {
        this.id = id;
        this.website_name = website_name;
        this.url = url;
        this.domain_name = domain_name;
        this.scam_percentage = scam_percentage;
        this.virus_scan = virus_scan;
        this.secure = secure;
        this.num_reports = num_reports;
        this.linked_in_emps = linked_in_emps;
        this.age = age;
        this.redirected = redirected;
        this.similar_domain = similar_domain;
        this.pop_ups = pop_ups;
        this.ads = ads;
        this.funky_ui = funky_ui;
        this.flashy_images = flashy_images;
        this.offers_gifts = offers_gifts;
        this.reportedScams = reportedScams;
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

    public String getPop_ups() {
        return pop_ups;
    }

    public void setPop_ups(String pop_ups) {
        this.pop_ups = pop_ups;
    }

    public String getAds() {
        return ads;
    }

    public void setAds(String ads) {
        this.ads = ads;
    }

    public String getFunky_ui() {
        return funky_ui;
    }

    public void setFunky_ui(String funky_ui) {
        this.funky_ui = funky_ui;
    }

    public String getFlashy_images() {
        return flashy_images;
    }

    public void setFlashy_images(String flashy_images) {
        this.flashy_images = flashy_images;
    }

    public String getOffers_gifts() {
        return offers_gifts;
    }

    public void setOffers_gifts(String offers_gifts) {
        this.offers_gifts = offers_gifts;
    }

    public Collection<ScamReport> getReportedScams() {
        return reportedScams;
    }

    public void setReportedScams(Collection<ScamReport> reportedScams) {
        this.reportedScams = reportedScams;
    }

    @Override
    public String toString() {
        return "Website{" +
                "id=" + id +
                ", website_name='" + website_name + '\'' +
                ", url='" + url + '\'' +
                ", domain_name='" + domain_name + '\'' +
                ", scam_percentage=" + scam_percentage +
                ", virus_scan='" + virus_scan + '\'' +
                ", secure='" + secure + '\'' +
                ", num_reports=" + num_reports +
                ", linked_in_emps='" + linked_in_emps + '\'' +
                ", age='" + age + '\'' +
                ", redirected='" + redirected + '\'' +
                ", similar_domain='" + similar_domain + '\'' +
                ", pop_ups='" + pop_ups + '\'' +
                ", ads='" + ads + '\'' +
                ", funky_ui='" + funky_ui + '\'' +
                ", flashy_images='" + flashy_images + '\'' +
                ", offers_gifts='" + offers_gifts + '\'' +
                ", reportedScams=" + reportedScams +
                '}';
    }
}
