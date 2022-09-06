package com.example.isdb.web;

import com.example.isdb.Repository.PostRepository;
import com.example.isdb.Repository.ThreadRepository;
import com.example.isdb.Service.FetchWebsiteData;
import com.example.isdb.model.Post;
import com.example.isdb.model.User;
import com.example.isdb.model.Website;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ForumController {

    @Autowired
    PostRepository pRepo;

    @Autowired
    ThreadRepository tRepo;

    private User u;
    private SpringMVCController smvc;

    @GetMapping("/forumIndex")
    public String getForm(Model model) {
        Post p = new Post();
        model.addAttribute("p", p);

        return "forumIndex";
    }

    @PostMapping("/forumIndex")
    public String addPost(@ModelAttribute("p") Post p) {
        System.out.println(p);

//        System.out.println(smvc.currentUserName());

        Post newPost = pRepo.save(p);


        return "postMade";
    }

    //knowledge hub / knowlede base
    @GetMapping({"/forumThread"})
    public ModelAndView getPosts(Model model) {

        List<Post> pm = pRepo.findAll();

        ModelAndView mav = new ModelAndView("forumThread");
        mav.addObject("pm", pm);
        return mav;
    }


    @GetMapping("/reply")
    public String getReplyForm(Model model) {
        Thread t = new Thread();
        model.addAttribute("t", t);

        return "reply";
    }

    @PostMapping("/reply")
    public String addReply(@ModelAttribute("t") Thread t) {
        System.out.println(t);

//        System.out.println(smvc.currentUserName());

        Thread newThread = tRepo.save(t);


        return "postMade";
    }
}