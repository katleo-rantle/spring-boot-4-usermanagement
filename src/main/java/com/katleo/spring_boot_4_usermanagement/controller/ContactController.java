package com.katleo.spring_boot_4_usermanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contact/api/v1")
public class ContactController {
    @GetMapping("/details")
    public String getContacts(){
        return "contacts";
    }
}
