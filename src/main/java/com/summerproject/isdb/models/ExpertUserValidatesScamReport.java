package com.summerproject.isdb.models;

import javax.persistence.*;

@Entity
@Table (name = "expert_user_validates_scam_report")
public class ExpertUserValidatesScamReport {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "expert_user_expert_id")
    Integer expert_user_expert_id;

    @Column(name = "scam_report_id")
    Integer scam_report_id;

    public Integer getExpert_user_expert_id() {
        return expert_user_expert_id;
    }

    public void setExpert_user_expert_id(Integer expert_user_expert_id) {
        this.expert_user_expert_id = expert_user_expert_id;
    }

    public Integer getScam_report_id() {
        return scam_report_id;
    }

    public void setScam_report_id(Integer scam_report_id) {
        this.scam_report_id = scam_report_id;
    }
}
