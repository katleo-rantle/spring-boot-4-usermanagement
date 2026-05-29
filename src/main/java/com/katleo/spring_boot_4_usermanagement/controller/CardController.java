package com.katleo.spring_boot_4_usermanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("card/api/v1")
public class CardController {
    @GetMapping("/details")
    public String getCards(){
        return "cards";
    }
}
