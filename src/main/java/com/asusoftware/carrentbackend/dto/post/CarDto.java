package com.asusoftware.carrentbackend.dto.post;

import com.asusoftware.carrentbackend.model.Car;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/25/2021
 */
@Getter
@Setter
public class CarDto {
    private UUID id;
    @NotBlank private String carBrand;
    @NotBlank private String carModel;
    @NotBlank private String color;
    @NotNull private LocalDateTime year;
    @NotNull private int hp;
    @NotNull private List<String> images;

    public static Car toEntity(CarDto carDto) {
        Car car = new Car();
        car.setCarBrand(carDto.getCarBrand());
        car.setCarModel(carDto.getCarModel());
        car.setColor(carDto.getColor());
        car.setYear(carDto.getYear());
        car.setHp(carDto.getHp());
        car.setImages(carDto.getImages());
        return car;
    }

    public static CarDto toDto(Car car) {
        CarDto carDto = new CarDto();
        carDto.setId(car.getId());
        carDto.setCarBrand(carDto.getCarBrand());
        carDto.setCarModel(car.getCarModel());
        carDto.setColor(car.getColor());
        carDto.setYear(car.getYear());
        carDto.setHp(car.getHp());
        carDto.setImages(car.getImages());
        return carDto;
    }
}
