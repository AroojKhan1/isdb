package com.example.isdb.Service;

import com.example.isdb.Repository.ScamReportRepository;
import com.example.isdb.model.ScamReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Service
public class ExpVerifyService {

//    @PersistenceContext
//    private EntityManager entityManager;

    @Autowired
    private ScamReportRepository srr;

    public void updateVerificationFlag(Long id){
        System.out.println("getting id from service " + id);
        ScamReport sr = srr.findById(id).get();
        sr.setVerified("Y");
        srr.save(sr);
        System.out.println(sr);
    }
}
