package com.example.isdb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForumController {
    @GetMapping("/forumIndex")
    public String getForm(){
        return "forumIndex";
    }
}
