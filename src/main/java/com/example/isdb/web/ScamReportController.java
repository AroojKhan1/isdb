package com.example.isdb.web;

import com.example.isdb.Service.ScamReportService;
import com.example.isdb.model.ScamReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ScamReportController {
    @Autowired
    ScamReportService scamReportService;

    @GetMapping({"/scamReports"})
    public ModelAndView getScamReports(Model model){
        List<ScamReport> sr = scamReportService.findAll();

        ModelAndView mav =  new ModelAndView("ScamReport");
        mav.addObject("sr", sr);
        return mav;
    }


}
