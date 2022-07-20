package com.example.isdb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collection;

import javax.persistence.*;


@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;

    @Column(name = "user_type")
    private String user_type;

    @Column(name = "state")
    private String state;

    @Column(name = "qualification")
    private String qualification;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "company")
    private String company;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))

    private Collection <Role> roles;

    @OneToMany(mappedBy = "reportingUser")
    @JsonIgnore
    private Collection<ScamReport> userScamReports;


    public User() {

    }

    public User(String firstName, String lastName, String user_name, String email, String user_type,
                String state, String qualification, String occupation, String company, String password, Collection<Role> roles) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.user_name = user_name;
        this.email = email;
        this.password = password;
        this.user_type = user_type;
        this.state = state;
        this.qualification = qualification;
        this.occupation = occupation;
        this.company = company;
        this.roles = roles;

    }

    public User(String firstName, String lastName, String email, String password, Collection < Role > roles) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Collection < Role > getRoles() {
        return roles;
    }
    public void setRoles(Collection < Role > roles) {
        this.roles = roles;
    }
    public Collection<ScamReport> getUserScamReports() {
        return userScamReports;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setUserScamReports(Collection<ScamReport> userScamReports) {
        this.userScamReports = userScamReports;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}