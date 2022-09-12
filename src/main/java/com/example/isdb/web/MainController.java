package com.example.isdb.web;

import com.example.isdb.Repository.UserRepository;
import com.example.isdb.auth.IsdbUserDetail;
import com.example.isdb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }


    @RequestMapping("/home")
    public String Welcome(HttpServletRequest request) {
        request.setAttribute("mode", "MODE_HOME");
        return "home";
    }

    @Autowired
    private UserRepository userRepo;

    @RequestMapping("/account")
    public String viewUserAccountForm(
            @AuthenticationPrincipal IsdbUserDetail userDetails,
            Model model) {
        String userEmail = userDetails.getUsername();
        User user = userRepo.getUserByEmail(userEmail);

        model.addAttribute("user", user);
        model.addAttribute("pageTitle", "Account Details");

        return "users/account_form";
    }


}