package com.teamc.fms.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "time_slot")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimeSlotEntity {
    @Id
    private Integer id;
    @NotNull
    private Timestamp start_hour;
    @NotNull
    private Timestamp end_hour;
//    @NotNull

//    @ManyToOne
//    @JoinColumn(name = "facility_id")
//    private String facility_id;
}
