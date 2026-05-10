package com.mtangels.school_website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/management")
    public String management() {
        return "management";
    }

    @GetMapping("/academics")
    public String academics() {
        return "academics";
    }

    @GetMapping("/gallery")
    public String gallery() {
        return "gallery";
    }

    @GetMapping("/tenders")
    public String tenders() {
        return "tenders";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/innovation")
    public String innovation() {
        return "innovation";
    }

    @GetMapping("/charter")
    public String charter() {
        return "charter";
    }

}