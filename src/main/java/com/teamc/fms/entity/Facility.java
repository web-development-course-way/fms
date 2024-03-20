package com.teamc.fms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "facility")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Facility {
    @Id
    private String id;
    @NotNull
    private String name;
    
    private String description;
    @NotNull 
    private Integer maxCapacity;
    @OneToMany(mappedBy = "facility")
    private List<TimeSlot> timeSlotList;
}
