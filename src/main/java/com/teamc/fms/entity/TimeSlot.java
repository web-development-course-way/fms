package com.teamc.fms.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.sql.Time;

@Entity
@Table(name = "time_slot")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimeSlot {
    @Id
    private Integer id;
    @NotNull
    private Time startHour;
    @NotNull
    private Time endHour;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "facility_id")
    private Facility facility;
}
