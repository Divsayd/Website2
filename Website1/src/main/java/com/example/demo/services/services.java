package com.example.demo.services;

import com.example.demo.controller.ContactController;
import com.example.demo.model.Contact;
import com.example.demo.repository.contactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@ApplicationScope
public class services {

    public int getCounter() {
        return counter;
    }

    @Autowired
private contactRepository contactRepository1;


    int counter=0;

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public services(){
        System.out.println("Contact Service bean initialized");
    }


    private static Logger log= LoggerFactory.getLogger(ContactController.class);
    public boolean display(Contact contact) {
        boolean isSaved;
        int status = contactRepository1.saveMsg(contact);
        if (status > 0) {
            isSaved = true;
        } else {
            isSaved = false;
        }
        return isSaved;
    }

}

