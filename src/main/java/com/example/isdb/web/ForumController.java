package com.example.isdb.web;

import com.example.isdb.Repository.PostRepository;
import com.example.isdb.model.Post;
import com.example.isdb.model.ScamReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ForumController {

    @Autowired
    PostRepository pRepo;
    @GetMapping("/forumIndex")
    public String getForm(Model model){
        Post p = new Post();
        model.addAttribute("p", p);

        return "forumIndex";
    }

    @PostMapping("/addPost")
    public String addPost(@ModelAttribute("p") Post p){
        System.out.println(p);
        Post newPost = pRepo.save(p);


        return "forumIndex";
    }

//    @PostMapping("/userScamReport")
//    public String submitForm(@ModelAttribute("sr") ScamReport sr){
//        System.out.println(sr);
//        ScamReport reportInserted = srepo.save(sr);
//        return "reportSuccess";
//    }
}
