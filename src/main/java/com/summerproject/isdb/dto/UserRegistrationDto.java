package com.summerproject.isdb.dto;
import java.sql.Date;

public class UserRegistrationDto {

    private int user_id;
    private String fName;
    private String lName;

    private int phone;
    private String email;

    private String state;

    private String userType;

    private String userName;

    private Date dob;
    private String password;

    public UserRegistrationDto(int user_id, String fName, String lName, int phone, String email, String state, String userType, String userName, Date dob, String password) {
        this.user_id = user_id;
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
        this.state = state;
        this.userType = userType;
        this.userName = userName;
        this.dob = dob;
        this.password = password;
    }

    public UserRegistrationDto(String fName, String lName, String email, String password) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
    }

    public UserRegistrationDto() {

    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
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
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
