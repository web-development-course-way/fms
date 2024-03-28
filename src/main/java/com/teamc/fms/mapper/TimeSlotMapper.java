package com.teamc.fms.mapper;


import com.teamc.fms.dto.TimeSlotDto;
import com.teamc.fms.entity.TimeSlot;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TimeSlotMapper {

    private final ModelMapper mapper;

    public TimeSlotDto toTimeSlotDto(TimeSlot timeSlot) {
        return mapper.map(timeSlot, TimeSlotDto.class);
    }

    public TimeSlot toTimeSlot(TimeSlotDto dto) {
        return mapper.map(dto, TimeSlot.class);
    }

}
