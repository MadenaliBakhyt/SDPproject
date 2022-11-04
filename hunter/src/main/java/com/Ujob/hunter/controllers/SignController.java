package com.Ujob.hunter.controllers;

import com.Ujob.hunter.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SignController {
    List<User> listofusers = new ArrayList<>();
    @GetMapping("/signup")
    public String getSignUp(Model model){
        return "signup";
    }

    @PostMapping("/user/create")
    public String createUser(@RequestParam(value = "firstname") String firstname,
                             @RequestParam(value = "lastname") String lastname,
                             @RequestParam(value = "date") String date,
                             @RequestParam(value = "address") String address){
        User user=new User(firstname,lastname,date,address);
        listofusers.add(user);
        return "redirect:/";


    }


}
