package com.teamc.fms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "country")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    @Id
    private String code;
    @NotNull
    private String name;
    @NotNull
    private String nationality;

}
