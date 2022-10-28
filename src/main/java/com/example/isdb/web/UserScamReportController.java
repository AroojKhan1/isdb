package com.example.isdb.web;

import com.example.isdb.Repository.UserRepository;
import com.example.isdb.Repository.UserScamReportRepository;
import com.example.isdb.model.ScamReport;
import com.example.isdb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;
@Controller
public class UserScamReportController {

    @Autowired
    private UserScamReportRepository srepo;
    @Autowired
    UserRepository uRepo;
    @GetMapping("/userScamReport")
    public String showForm(Model model, Model model1, Principal principal) {
        User user = uRepo.getUserByEmail(principal.getName());
        model1.addAttribute("user", user);

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
