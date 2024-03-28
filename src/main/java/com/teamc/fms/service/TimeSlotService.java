package com.teamc.fms.service;

import com.teamc.fms.dto.TimeSlotDto;
import com.teamc.fms.entity.TimeSlot;

import java.util.List;
import java.util.Optional;

public interface TimeSlotService {

    TimeSlotDto updateTimeSlot(String id, TimeSlotDto timeSlot);

    //    List<TimeSlot> getTimeSlotsOrderByCodeAsc();
    List<TimeSlot> getAllTimeSlots();

    TimeSlotDto addTimeSlot(TimeSlotDto timeSlot);

    Optional<TimeSlot> getTimeSlotById(String id);

    boolean deleteTimeSlot(String id);

}
