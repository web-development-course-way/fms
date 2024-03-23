package com.teamc.fms.controller;

import com.teamc.fms.dto.CountryDto;
import com.teamc.fms.entity.Country;
import com.teamc.fms.mapper.CountryMapper;
import com.teamc.fms.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/countries")
public class CountryController {

    private final CountryService countryService;
    private final CountryMapper countryMapper;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<CountryDto> getCountriesOrderByCodeAsc() {
        List<Country> countries = countryService.getCountriesOrderByCodeAsc();
        return countries.stream().map(countryMapper::toCountryDto).toList();
    }

}


