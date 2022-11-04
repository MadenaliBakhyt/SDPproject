package com.Ujob.hunter.controllers;

import com.Ujob.hunter.Database;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class GetVPController {
    @GetMapping("/getvp")
    public String getVacP(Model model){
        return "getvacp";
    }

    @PostMapping("/vacancy/search")
    public String createUser(@RequestParam(value = "language") String language,
                             @RequestParam(value = "level") String level){
        Database.setLevel(level);
        Database.setLang(language);

        return "redirect:/getvpp";


    }



}
