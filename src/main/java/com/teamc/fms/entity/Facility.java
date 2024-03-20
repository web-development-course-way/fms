package com.teamc.fms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "Facility")
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
    @NotNull
    private String description;
    @NotNull
    private Integer max_capacity;
}
