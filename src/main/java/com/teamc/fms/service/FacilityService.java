package com.teamc.fms.service;

import com.teamc.fms.entity.Facility;
import com.teamc.fms.repo.FacilityRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FacilityService {

    public abstract List<Facility> getFacilities();

    public abstract void addFacility(Facility facility);

    public abstract void deleteFacility(String id);

    public abstract void updateFacility(Facility facility);
}
