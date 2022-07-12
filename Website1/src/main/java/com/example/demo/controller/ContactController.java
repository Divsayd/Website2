package com.example.demo.controller;

import com.example.demo.model.Contact;
import com.example.demo.services.services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
@Controller
public class ContactController {

    private com.example.demo.services.services services;

    private static Logger log= LoggerFactory.getLogger(ContactController.class);

    @Autowired
    public ContactController(services services){
        this.services=services;
    }
    @RequestMapping("/contact")
    public String displayContactPage(Model model, Authentication authentication) {
        model.addAttribute("contact", new Contact());

        return "contact.html";
    }

    @RequestMapping(value = "/saveMsg",method = POST)
    public String saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors errors) {
        if(errors.hasErrors()){
            log.error("error there" + errors.toString());
            return "contact.html";
        }

        services.display(contact);

        return "redirect:/contact";
    }
}