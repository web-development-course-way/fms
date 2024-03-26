package com.teamc.fms.service.impl;

import com.teamc.fms.entity.Facility;
import com.teamc.fms.repo.FacilityRepository;
import com.teamc.fms.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class FacilityServiceImpl implements FacilityService {

    @Autowired
    private FacilityRepository facilityRepository;



    public List<Facility> getFacilities(){
        return facilityRepository.findAll();
    }

    public void addFacility(Facility facility){

        facilityRepository.save(facility);

    }

    public void deleteFacility(String id){

        facilityRepository.deleteById(id);

    }

    public void updateFacility(Facility facility){

        Facility f = facilityRepository.findById(facility.getId()).orElse(null);
        assert f != null;
        f.setDescription(f.getDescription());
        f.setName(facility.getName());
        f.setMaxCapacity(facility.getMaxCapacity());
        f.setTimeSlotList(facility.getTimeSlotList());


    }
}
