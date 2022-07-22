package com.example.isdb.model;

        import com.fasterxml.jackson.annotation.JsonIgnore;

        import javax.persistence.*;
        import java.util.Collection;


@Entity
@Table(name = "scam_report")
public class ScamReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (name="website_name")
    private String website_name;
    @Column (name="url")
    private String url;
    @Column (name="report")
    private String report;
    @Column (name="user_type")
    private String user_type;

    @ManyToOne
    @JoinColumn(name="reporting_user_id", referencedColumnName = "id")
    private User reportingUser;


    @JsonIgnore
    @ManyToMany(mappedBy = "reportedScams")
    private Collection<Website> websites;

    public ScamReport() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWebsite_name() {
        return website_name;
    }

    public void setWebsite_name(String website_name) {
        this.website_name = website_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public User getReportingUser() {
        return reportingUser;
    }

    public void setReportingUser(User reportingUser) {
        this.reportingUser = reportingUser;
    }

    public Collection<Website> getWebsites() {
        return websites;
    }

    public void setWebsites(Collection<Website> websites) {
        this.websites = websites;
    }

    public ScamReport(String website_name, String url, String report, String user_type) {
        this.website_name = website_name;
        this.url = url;
        this.report = report;
        this.user_type = user_type;
    }
}
