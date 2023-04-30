package com.logreg.logregartifact.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.logreg.logregartifact.model.Model;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/home")
    public String goHome(@RequestParam String message, Model model){
        model.setAppName(appName);
        return "home";
    }
    
}
