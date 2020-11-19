package com.springbootapp.fleetapp.controllers;

import com.springbootapp.fleetapp.models.Country;
import com.springbootapp.fleetapp.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country")
    public String getCountries(Model model) {
        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries", countryList); // this 'countries' is the name used in the html page
        return "country";
    }

    @PostMapping("/country/addNew")
    public String addNew(Country country) {
        countryService.save(country);
        return "redirect:/country";
    }
}

// all of the mapping relates between the controller and the html file, the /country is in both