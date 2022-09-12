package com.example.isdb.web;

import com.example.isdb.Repository.UserRepository;
import com.example.isdb.Service.UserService;
import com.example.isdb.auth.IsdbUserDetail;
import com.example.isdb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AccountController {


        @Autowired
        private UserRepository userRepo;

        @GetMapping("/account")
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
