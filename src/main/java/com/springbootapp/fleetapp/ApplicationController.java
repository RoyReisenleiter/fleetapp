package com.springbootapp.fleetapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index") //the mapping is what is types into the URL bar
    public String gohome() {
        return "index";
    } //the return name refers to the name of the html page to return
}
