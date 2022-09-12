package com.example.isdb.Service;

import com.example.isdb.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
