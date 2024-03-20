package com.teamc.fms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "booking_type")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingType {
    @Id
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private String code;
    private String description;
}
