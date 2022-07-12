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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="website_id", referencedColumnName = "id")
    private Website website;

    @ManyToOne
    @JoinColumn(name="reporting_user_id", referencedColumnName = "id")
    private User reportingUser;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDomain_name() {
        return domain_name;
    }

    public void setDomain_name(String domain_name) {
        this.domain_name = domain_name;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getUser_user_id() {
        return user_user_id;
    }

    public void setUser_user_id(String user_user_id) {
        this.user_user_id = user_user_id;
    }

    public Website getWebsite() {
        return website;
    }

    public void setWebsite(Website website) {
        this.website = website;
    }
}
