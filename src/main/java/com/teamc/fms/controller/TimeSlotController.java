package com.teamc.fms.controller;


import com.teamc.fms.dto.TimeSlotDto;
import com.teamc.fms.entity.TimeSlot;
import com.teamc.fms.mapper.TimeSlotMapper;
import com.teamc.fms.service.TimeSlotService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class TimeSlotController {
    private final TimeSlotService timeSlotService;
    private final TimeSlotMapper timeSlotMapper;


    @PostMapping("/time-slots")
    @ResponseStatus(HttpStatus.CREATED)
    public TimeSlotDto addTimeSlot(@RequestBody TimeSlotDto timeSlot) {
        return timeSlotService.addTimeSlot(timeSlot);
    }

    @GetMapping("/time-slots")
    @ResponseStatus(HttpStatus.OK)
    public List<TimeSlotDto> getAllTimeSlots() {
        List<TimeSlot> timeSlots = timeSlotService.getAllTimeSlots();
        return timeSlots.stream().map(timeSlotMapper::toTimeSlotDto).toList();
    }

    @GetMapping("/time-slots/{id}")
    public ResponseEntity<Optional<TimeSlot>> getUserById(@PathVariable("id") String id) {
        Optional<TimeSlot> timeSlotDto = null;
        timeSlotDto = timeSlotService.getTimeSlotById(id);
        return ResponseEntity.ok(timeSlotDto);
    }

    @DeleteMapping("/time-slots/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteTimeSlot(@PathVariable("id") String id) {
        boolean deleted = false;
        deleted =timeSlotService.deleteTimeSlot(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/time-slots/{id}")
    public ResponseEntity<TimeSlotDto> updateTimeSlot(@PathVariable("id") String id,
                                                      @RequestBody TimeSlotDto timeSlot) {
        timeSlot = timeSlotService.updateTimeSlot(id,timeSlot);
        return ResponseEntity.ok(timeSlot);
    }

}
