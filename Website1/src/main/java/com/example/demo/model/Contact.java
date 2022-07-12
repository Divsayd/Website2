package com.example.demo.model;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class Contact extends extra{

   private int contact_id;
    @NotBlank(message="Name should not be blank")
    @Size(min=2,message="Name must ne atleast 3 characters long")
    private String name;

    private String mobileNum;
    private String email;
    private String subject;
    private String message;
    private String status;




}
