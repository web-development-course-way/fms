package com.teamc.fms.service;

import com.teamc.fms.entity.Country;

import java.util.List;

public interface CountryService {

    /**
     * @return All countries order by country code in ASC order
     */
    List<Country> getCountriesOrderByCodeAsc();

}
