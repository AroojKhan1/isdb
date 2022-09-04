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
    @Autowired
    ExpVerifyService evs;

    private Website w;
    @Autowired
    ScamReportRepository scamReportService;
    @Autowired
    private WebsiteRepository wrepo;

    @GetMapping({"/expScamReport"})
    public ModelAndView getScamReports(Model model) {
        List<ScamReport> sr = scamReportService.findAll();

        ModelAndView mav = new ModelAndView("expScamReport");
        mav.addObject("sr", sr);
        System.out.println(sr.get(0).getId());
        return mav;
    }


    @PostMapping({"/validateStatus/{id}"})
    public String showForm(Model model, @PathVariable Long id) {
        model.addAttribute("w", new Website());
        model.addAttribute("id", id);

//        List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
//        model.addAttribute("listProfession", listProfession);


        return "validateStatus";
    }

    @PostMapping("/submit/{id}")
    public String submitForm(@ModelAttribute("w") Website w, @PathVariable Long id) {
        System.out.println(w);
        evs.updateVerificationFlag(id);
        Website websiteValidated = wrepo.save(w);
        return "validationSuccessful";
    }
}
