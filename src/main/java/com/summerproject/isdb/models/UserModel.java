package com.summerproject.isdb.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    Integer id;

    @Column(name = "f_name")
    String fName;

    @Column(name = "l_name")
    String Lname;

    @Column(name = "phone")
    Integer phone;

    @Column(name = "email")
    String email;

    @Column(name = "state")
    String state;

    @Column(name = "user_type")
    String userType;

    @Column(name = "user_name")
    String UserName;

    @Column(name = "dob")
    Date dob;

    @Column(name = "password")
    String password;

    public UserModel(String getfName, String getlName, String email, String password) {
    }

    public UserModel(Integer id, String fName, String lname, Integer phone, String email,
                     String state, String userType, String userName, Date dob, String password) {
        this.id = id;
        this.fName = fName;
        Lname = lname;
        this.phone = phone;
        this.email = email;
        this.state = state;
        this.userType = userType;
        UserName = userName;
        this.dob = dob;
        this.password = "password";
    }

    public UserModel() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
