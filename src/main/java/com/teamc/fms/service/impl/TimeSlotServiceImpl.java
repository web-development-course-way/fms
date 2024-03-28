package com.teamc.fms.service.impl;

import com.teamc.fms.dto.TimeSlotDto;
import com.teamc.fms.entity.TimeSlot;
import com.teamc.fms.repo.TimeSlotRepository;
import com.teamc.fms.service.FacilityService;
import com.teamc.fms.service.TimeSlotService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TimeSlotServiceImpl implements TimeSlotService {

    private final TimeSlotRepository timeSlotRepository;
    private final FacilityService facilityService;

    @Override
    public TimeSlotDto addTimeSlot(TimeSlotDto timeSlot) {
//        System.out.println(timeSlot);
        TimeSlot timeSlotEntity = new TimeSlot();
        BeanUtils.copyProperties(timeSlot, timeSlotEntity);
        timeSlotEntity.setFacility(facilityService.findById(timeSlot.getFacilityId())
                .orElseThrow(() -> new RuntimeException("facility not found") ));
        timeSlotRepository.save(timeSlotEntity);
        timeSlot.setId(timeSlotEntity.getId());
        return timeSlot;
    }

    @Override
    public Optional<TimeSlot> getTimeSlotById(String id) {
        return timeSlotRepository.findById(id);
    }

    @Override
    public boolean deleteTimeSlot(String id) {
        TimeSlot user =  timeSlotRepository.findById(id).get();
        timeSlotRepository.delete(user);
        return true;
    }


    @Override
    public TimeSlotDto updateTimeSlot(String id, TimeSlotDto timeSlot) {
        TimeSlot timeSlotEntity =
                timeSlotRepository.findById(id).get();
        timeSlotEntity.setStartHour(timeSlot.getStartHour());
        timeSlotEntity.setEndHour(timeSlot.getStartHour());
        timeSlotEntity.setFacility(facilityService.findById(timeSlot.getFacilityId())
                .orElseThrow(() -> new RuntimeException("facility not found") ));
        timeSlotRepository.save(timeSlotEntity);
        return timeSlot;
    }

    @Override
    public List<TimeSlot> getAllTimeSlots() {
        return timeSlotRepository.findAll();
    }


}
