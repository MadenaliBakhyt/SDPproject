package com.Ujob.hunter.controllers;

import com.Ujob.hunter.Database;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class GetVController {
    @GetMapping("/getv")
    public String getSignUp(Model model){
        model.addAttribute("vacancies", Database.getDatabase().getListOfVacancy());
        return "getvac";
    }


}
