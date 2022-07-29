package com.example.isdb.web;

import com.example.isdb.Repository.ExpVerifyScamReportRepository;
import com.example.isdb.Repository.UserScamReportRepository;
import com.example.isdb.Repository.WebsiteRepository;
import com.example.isdb.Service.ExpVerifyService;
import com.example.isdb.Service.FetchWebsiteData;
import com.example.isdb.model.ScamReport;
import com.example.isdb.Repository.ScamReportRepository;
import com.example.isdb.model.Website;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ExpVerifyScamReportController {

//
//    @Autowired
//    FetchWebsiteData fetchWebsiteData;
//    @Autowired
//    ExpVerifyService evs;
//
//    @Autowired
//    ExpVerifyScamReportRepository evsrr;

//
//    @GetMapping({"/expVerifyScamReport"})
//    public String verifyScamReports(Model model){
//        Website w = new Website();
//        model.addAttribute("w", w);
//        return "expVerifyScamReport";
//    }
//
//    @PostMapping("/expVerifyScamReport")
//    public String submitForm(@ModelAttribute("w") Website w){
//        System.out.println(w);
//        Website websiteInserted = evsrr.save(w);
//        return "reportSuccess";
//    }

//    @PostMapping({"/validateStatus/{id}"})
//    public ModelAndView updateVerificationStatus(Model model, @PathVariable Long id){
//        List<ScamReport> sr = scamReportService.findAll();
//
//        ModelAndView mav =  new ModelAndView("validateStatus");
//        mav.addObject("sr", sr);
//
//        System.out.println("id"+id);
//        evs.updateVerificationFlag(id);
//
//
//        return mav;
//    }


    @Autowired
    ScamReportRepository scamReportService;
    @Autowired
    private WebsiteRepository wrepo;

    @GetMapping({"/expScamReport"})
    public ModelAndView getScamReports(Model model) {
        List<ScamReport> sr = scamReportService.findAll();

        ModelAndView mav = new ModelAndView("expScamReport");
        mav.addObject("sr", sr);
        return mav;
    }



    @PostMapping({"/validateStatus/{id}"})
    public String showForm(Model model) {
        Website w = new Website();
        model.addAttribute("w", w);

//        List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
//        model.addAttribute("listProfession", listProfession);


        return "validateStatus";
    }

    @PostMapping("/validateStatus")
    public String submitForm(@ModelAttribute("w") Website w) {
        System.out.println(w);
        Website websiteValidated = wrepo.save(w);
        return "validationSuccessful";
    }
}
