package com.teamc.fms.service.impl;

import com.teamc.fms.entity.Facility;
import com.teamc.fms.entity.TimeSlot;
import com.teamc.fms.repo.FacilityRepository;
import com.teamc.fms.repo.TimeSlotRepository;
import com.teamc.fms.service.FacilityService;
import com.teamc.fms.service.TimeSlotService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FacilityServiceImpl implements FacilityService {

    private final FacilityRepository facilityRepository;

    @Override
    public Optional<Facility> findById(String id) {
        return facilityRepository.findById(id);
    }


}
