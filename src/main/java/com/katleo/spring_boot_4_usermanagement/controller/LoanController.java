package com.katleo.spring_boot_4_usermanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan/api/v1")
public class LoanController {
    @GetMapping("/details")
    public String getLoans(){
        return "loans";
    }

}
