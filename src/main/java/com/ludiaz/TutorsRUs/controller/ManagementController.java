package com.ludiaz.TutorsRUs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ManagementController {

    @ResponseBody
    @GetMapping("/management")
    public String management() {
        return "Hello World!";
    }
}
