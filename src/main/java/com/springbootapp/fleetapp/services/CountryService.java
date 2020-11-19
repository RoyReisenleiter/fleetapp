package com.springbootapp.fleetapp.services;

import com.springbootapp.fleetapp.models.Country;
import com.springbootapp.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    //returns list of countries
    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    public void save(Country country) {
        countryRepository.save(country);
    }

}
