package com.example.isdb.web;


import com.example.isdb.Repository.UserRepository;

import com.example.isdb.model.User;
import com.example.isdb.model.Website;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.List;
import java.util.Objects;

@Controller
public class MainController {

    @Autowired
    UserRepository uRepo;

//    Authentication authentication;
//    String email =authentication.getName();
//
//    //        System.out.println("USERNAME HERE"+email);
//    User user = uRepo.getUserByEmail(email);

    User user;


    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home(Principal principal, Model model) {
        User user = uRepo.getUserByEmail(principal.getName());
        model.addAttribute("user", user);
        return "index";
    }


//    @RequestMapping("/home")
//    public String Welcome(HttpServletRequest request, Authentication authentication) {
//
//
//        request.setAttribute("mode", "MODE_HOME");
//        String email =authentication.getName();
//
////        System.out.println("USERNAME HERE"+email);
//        User user = uRepo.getUserByEmail(email);
//
//        boolean isExpert = true;
//        if(Objects.equals(user.getUser_type(), "expert")){
//            isExpert = true;
//            System.out.println("user is expert");
//            request.setAttribute("isExpert", isExpert);
//        }
//
//
//
//        return "expertHome";
//
//
//    }

    @RequestMapping("/home")
    public String Welcome(ModelMap map, HttpServletRequest request, Authentication authentication) {


        request.setAttribute("mode", "MODE_HOME");
        String email =authentication.getName();

//        System.out.println("USERNAME HERE"+email);
        User user = uRepo.getUserByEmail(email);

//        boolean isExpert = true;
//        if(Objects.equals(user.getUser_type(), "expert")){
//            isExpert = true;
//            System.out.println("user is expert");
////            request.setAttribute("isExpert", isExpert);
//            map.put("isExpert", "isExpert");
//        }



        return "home";


    }

}