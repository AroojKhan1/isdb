package com.example.isdb.web;

import com.example.isdb.Service.FetchWebsiteData;
import com.example.isdb.model.Website;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class WebsiteListController {
    @Autowired
    private FetchWebsiteData fetchWebsiteData;
    @GetMapping({"/list"})
    public ModelAndView getWebsites(Model model){

        List<Website> wm = fetchWebsiteData.findAll();


        ModelAndView mav = new ModelAndView("WebsiteList");
        mav.addObject("wm", wm);
        return mav;



    }

}
