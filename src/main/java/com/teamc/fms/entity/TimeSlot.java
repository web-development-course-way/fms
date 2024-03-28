package com.teamc.fms.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.sql.Time;

@Entity
@Table(name = "timeslot")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimeSlot {
    @Id
    @SequenceGenerator(name = "timeslot_id_seq", sequenceName = "timeslot_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "timeslot_id_seq")
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
