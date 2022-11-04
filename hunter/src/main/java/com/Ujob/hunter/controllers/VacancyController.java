package com.Ujob.hunter.controllers;

import com.Ujob.hunter.Database;
import com.Ujob.hunter.entity.strategy.Vacancy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VacancyController {
    @GetMapping("/createv")
    public String getSignUp(Model model){
        return "createvac";
    }


    @PostMapping("/vacancy/create")
    public String createUser(@RequestParam(value = "language") String language,
                             @RequestParam(value = "level") String level,
                             @RequestParam(value = "company") String company){
        Vacancy vcn=new Vacancy(language,level,company);
        Database.getDatabase().addVacancy(vcn);

        return "redirect:/createv";


    }

}
