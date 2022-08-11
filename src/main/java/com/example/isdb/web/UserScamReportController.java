package com.example.isdb.web;

import com.example.isdb.Repository.UserScamReportRepository;
import com.example.isdb.model.ScamReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;
@Controller
public class UserScamReportController {

    @Autowired
    private UserScamReportRepository srepo;

    @GetMapping("/userScamReport")
    public String showForm(Model model) {
        ScamReport sr = new ScamReport();
        model.addAttribute("sr", sr);

//        List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
//        model.addAttribute("listProfession", listProfession);



        return "userScamReport";
    }

    @PostMapping("/userScamReport")
    public String submitForm(@ModelAttribute("sr") ScamReport sr){

        ScamReport reportInserted = srepo.save(sr);
        return "reportSuccess";
    }
}
