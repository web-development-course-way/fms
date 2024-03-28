package com.teamc.fms.service;

import com.teamc.fms.entity.Facility;
import com.teamc.fms.entity.TimeSlot;

import java.util.Optional;

public interface FacilityService {


    Optional<Facility> findById(String id);
}
