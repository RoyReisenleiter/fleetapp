package com.springbootapp.fleetapp.services;

import com.springbootapp.fleetapp.models.Country;
import com.springbootapp.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    //get by id, the optional means it will still work without crashing the program if it doesn't find the country
    public Optional<Country> findById(int id) {
        return countryRepository.findById(id);
    }

}
