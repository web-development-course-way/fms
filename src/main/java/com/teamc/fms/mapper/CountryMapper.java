package com.teamc.fms.mapper;

import com.teamc.fms.dto.CountryDto;
import com.teamc.fms.entity.Country;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryMapper {

    private final ModelMapper mapper;

    public CountryDto toCountryDto(Country country) {
        return mapper.map(country, CountryDto.class);
    }

    public Country toCountry(CountryDto dto) {
        return mapper.map(dto, Country.class);
    }

}
