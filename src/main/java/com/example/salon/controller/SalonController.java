package com.example.salon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SalonController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/services")
    public String services() {
        return "services";
    }

    @GetMapping("/booking")
    public String booking() {
        return "booking";
    }

    @PostMapping("/booking")
    public String bookingSuccess() {
        return "success";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}