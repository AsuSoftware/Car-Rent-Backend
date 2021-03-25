package com.asusoftware.carrentbackend.dto.post;

import com.asusoftware.carrentbackend.model.Post;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * car-rent-backend Created by Antonio on 3/25/2021
 */
@Getter
@Setter
public class CreatePostDto {
    @NotBlank private String phone;
    @NotBlank private String pricePerDay;
    @NotNull private CarDto carDto;

    public static Post toEntity(CreatePostDto createPostDto) {
        Post post = new Post();
        post.setPhone(createPostDto.getPhone());
        post.setPricePerDay(createPostDto.getPricePerDay());
        post.setCreatedAt(LocalDateTime.now(ZoneOffset.UTC));
        post.setCar(CarDto.toEntity(createPostDto.getCarDto()));
        return post;
    }
}
