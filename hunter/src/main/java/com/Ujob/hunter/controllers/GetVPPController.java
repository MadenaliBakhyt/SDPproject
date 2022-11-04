package com.Ujob.hunter.controllers;

import com.Ujob.hunter.Database;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class GetVPPController {
    @GetMapping("/getvpp")
    public String getSignUp(Model model){
        model.addAttribute("vacancies", Database.getDatabase().getListOfVacancy(Database.getLevel(),Database.getLang()));
        return "vetvacpp";
    }
}
