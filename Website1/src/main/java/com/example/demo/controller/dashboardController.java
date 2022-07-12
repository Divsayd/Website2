package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class dashboardController {
    @RequestMapping("/dashboard")
    public String displayDash (Model model, Authentication authentication) throws Exception{
        model.addAttribute("User",authentication.getName());
        model.addAttribute("role",authentication.getAuthorities().toString());
       // throw new RuntimeException("Oops !! Got an error !!!");
       return "dashboard.html";
    }
}
