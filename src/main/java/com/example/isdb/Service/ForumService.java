package com.example.isdb.Service;

import com.example.isdb.Repository.PostRepository;
import com.example.isdb.Repository.ScamReportRepository;
import com.example.isdb.model.Post;
import com.example.isdb.model.ScamReport;
import com.example.isdb.model.Website;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ForumService {

    @Autowired
    private PostRepository pr;

//    public void setUserId(Long id){
//        System.out.println("getting id from service " + id);
//        ScamReport sr = srr.findById(id).get();
//        sr.setVerified("Y");
//        srr.save(sr);
//        System.out.println(sr);
//    }




}
