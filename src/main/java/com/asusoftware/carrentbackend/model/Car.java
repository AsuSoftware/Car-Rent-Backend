package com.asusoftware.carrentbackend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/24/2021
 */
@Getter
@Setter
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Column(name = "car_brand")
    private String carBrand;

    @NotBlank
    @Column(name = "car_model")
    private String carModel;

    @NotBlank
    @Column(name = "color")
    private String color;

    @NotNull
    @Column(name = "car_year")
    private LocalDateTime year;

    @NotNull
    @Column(name = "hp")
    private int hp;

    @NotNull
    @Column(name = "images")
    private List<String> images;

}
