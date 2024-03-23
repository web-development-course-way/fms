package com.teamc.fms.service.impl;

import com.teamc.fms.entity.Country;
import com.teamc.fms.repo.CountryRepository;
import com.teamc.fms.service.CountryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    @Override
    public List<Country> getCountriesOrderByCodeAsc() {
        return countryRepository.findAllOrderByCodeAsc();
    }

}
