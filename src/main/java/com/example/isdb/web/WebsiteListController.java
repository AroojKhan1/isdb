package com.example.isdb.web;

import com.example.isdb.Repository.UserRepository;
import com.example.isdb.Service.FetchWebsiteData;
import com.example.isdb.model.User;
import com.example.isdb.model.Website;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.List;

@RestController
public class WebsiteListController {

    @Autowired
    UserRepository uRepo;
    @Autowired
    private FetchWebsiteData fetchWebsiteData;
    @GetMapping({"/list"})
    public ModelAndView getWebsites(Model model, Principal principal){
        User user = uRepo.getUserByEmail(principal.getName());
        model.addAttribute("user", user);

        List<Website> wm = fetchWebsiteData.findAll();
        ModelAndView mav = new ModelAndView("WebsiteList");
        mav.addObject("wm", wm);
        return mav;



    }

}
