package com.teamc.fms.controller;


import com.teamc.fms.model.TimeSlot;
import com.teamc.fms.service.TimeSlotService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class TimeSlotController {

    private final TimeSlotService timeSlotService;

    public TimeSlotController(TimeSlotService timeSlotService) {
        this.timeSlotService = timeSlotService;
    }


    @PostMapping("/time-slots")
    public TimeSlot saveTimeSlot(@RequestBody TimeSlot timeSlot){return timeSlotService.saveTimeSlot(timeSlot);}

}
