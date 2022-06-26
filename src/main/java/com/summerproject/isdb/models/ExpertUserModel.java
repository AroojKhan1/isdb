package com.summerproject.isdb.models;

import javax.persistence.*;

@Entity
@Table(name = "expert_user")
public class ExpertUserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "expert_id")
    Integer expert_id;

    @Column(name = "work_place")
    Integer work_place;

    @Column(name = "profession")
    Integer profession;

    @Column(name = "qualification")
    Integer qualification;

    @Column(name = "user_user_id")
    Integer user_user_id;

    public Integer getExpert_id() {
        return expert_id;
    }

    public void setExpert_id(Integer expert_id) {
        this.expert_id = expert_id;
    }

    public Integer getWork_place() {
        return work_place;
    }

    public void setWork_place(Integer work_place) {
        this.work_place = work_place;
    }

    public Integer getProfession() {
        return profession;
    }

    public void setProfession(Integer profession) {
        this.profession = profession;
    }

    public Integer getQualification() {
        return qualification;
    }

    public void setQualification(Integer qualification) {
        this.qualification = qualification;
    }

    public Integer getUser_user_id() {
        return user_user_id;
    }

    public void setUser_user_id(Integer user_user_id) {
        this.user_user_id = user_user_id;
    }
}
