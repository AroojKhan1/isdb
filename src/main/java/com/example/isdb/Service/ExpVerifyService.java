package com.example.isdb.Service;

import com.example.isdb.Repository.ScamReportRepository;
import com.example.isdb.Repository.WebsiteRepository;
import com.example.isdb.model.ScamReport;
import com.example.isdb.model.Website;
import org.springframework.beans.BeanUtils;
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

    @Autowired
    private WebsiteRepository wr;


//Similar Domain 15
//Virus Scan 20
//Redirected 8
//Secure 10
//LinkedIn Employees 5
//Age<1 8
//pop ups 6
//ads 6
//flashy Images 5
//Funky UI 10
//Offers Gifts 7

    public Website upsertWebsite(Website website){
        Website existingW = wr.findByUrl(website.getUrl());
        double scamPercent = calculateScamPercentage(website);
        website.setScam_percentage(scamPercent);
        if(existingW != null){
            System.out.println("updating existing website");
            BeanUtils.copyProperties(website, existingW, "id");
            return wr.save(existingW);
        } else {
            System.out.println("creating new website");
            return wr.save(website);
        }
    }


    public double calculateScamPercentage(Website w){
        double scampercentage = 0.0;

        if("Y".equalsIgnoreCase(w.getSimilar_domain())){
            scampercentage = scampercentage+0.15;
        }
        if("Y".equalsIgnoreCase(w.getVirus_scan())){
            scampercentage = scampercentage+0.20;
        }
        if("Y".equalsIgnoreCase(w.getRedirected())){
            scampercentage = scampercentage+0.08;
        }
        if("Y".equalsIgnoreCase(w.getSecure())){
            scampercentage = scampercentage+0.10;
        }
        if("Y".equalsIgnoreCase(w.getLinked_in_emps())){
            scampercentage = scampercentage+0.05;
        }
        if("Y".equalsIgnoreCase(w.getAge())){
            scampercentage = scampercentage+0.08;
        }
        if("Y".equalsIgnoreCase(w.getPop_ups())){
            scampercentage = scampercentage+0.06;
        }
        if("Y".equalsIgnoreCase(w.getAds())){
            scampercentage = scampercentage+0.06;
        }
        if("Y".equalsIgnoreCase(w.getFlashy_images())){
            scampercentage = scampercentage+0.05;
        }
        if("Y".equalsIgnoreCase(w.getFunky_ui())){
            scampercentage = scampercentage+0.10;
        }
        if("Y".equalsIgnoreCase(w.getOffers_gifts())){
            scampercentage = scampercentage+0.07;
        }
        return scampercentage;

    }

    public void updateSRVerificationFlag(Long id){
        System.out.println("getting id from service " + id);
        ScamReport sr = srr.findById(id).get();
        sr.setVerified("Y");
        srr.save(sr);
    }
}
