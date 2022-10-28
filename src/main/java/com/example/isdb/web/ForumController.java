package com.example.isdb.web;

import com.example.isdb.Repository.PostRepository;
import com.example.isdb.Repository.ThreadRepository;
import com.example.isdb.Repository.UserRepository;
import com.example.isdb.Service.ReplyService;
import com.example.isdb.model.Post;
import com.example.isdb.model.Replies;
import com.example.isdb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.List;

@Controller
public class ForumController {

    @Autowired
    PostRepository pRepo;

    @Autowired
    ThreadRepository tRepo;

    @Autowired
    ReplyService rs;

    @Autowired
    UserRepository uRepo;

    private User u;
    private SpringMVCController smvc;

    @GetMapping("/forumIndex")
    public String getForm(Model model,Model model1, Principal principal) {
        User user = uRepo.getUserByEmail(principal.getName());
        model1.addAttribute("user", user);

        Post p = new Post();
        model.addAttribute("p", p);

        return "forumIndex";
    }

    //reason why i dont have posting form and thread
    // on the same page is because of the return
    // postmade stetement below
    @PostMapping("/forumIndex")
    public String addPost(@ModelAttribute("p") Post p) {
        Post newPost = pRepo.save(p);

        return "postMade";
    }

    //knowledge hub / knowlede base
    @GetMapping({"/forumThread"})
    public ModelAndView getPosts(Model model,Model model1, Principal principal) {
        User user = uRepo.getUserByEmail(principal.getName());
        model1.addAttribute("user", user);

        List<Post> pm = pRepo.findAll();
        ModelAndView mav = new ModelAndView("forumThread");
        mav.addObject("pm", pm);
        return mav;
    }


    //@todo complete reply feature

//    @GetMapping("/reply")
//    public String getReplyForm(Model model) {
//        Replies r = new Replies();
//        model.addAttribute("r", r);
////        model.addAttribute("postId", postId);
//
//        return "reply";
//    }
////
//    @PostMapping("/reply")
//    public String addReply(@ModelAttribute("r") Replies r){
//
//
////        System.out.println(smvc.currentUserName());
////        rs.addPostId(postId,replyId);
//        Replies newReply = tRepo.save(r);
//
//
//        return "replyPosted";
//    }
}