package com.summerproject.isdb.controller;

import com.summerproject.isdb.repository.FetchDataService;
import com.summerproject.isdb.models.WebsitesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private FetchDataService fetchDataService;


    @GetMapping({"/list"})
    public ModelAndView  getWebsites(Model model){

        List<WebsitesModel> wm = fetchDataService.findAll();


        ModelAndView mav = new ModelAndView("list-websites");
//        mav.addObject("wm", fetchDataService.findAll());
        mav.addObject("wm", wm);
        return mav;
    }





    List<WebsitesModel> getUsers(){
        return fetchDataService.findAll();
    }


}
