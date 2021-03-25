package com.asusoftware.carrentbackend.dto.post;

import com.asusoftware.carrentbackend.model.Post;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/25/2021
 */
@Getter
@Setter
public class PostDto {

    @NotBlank private UUID id;
    @NotNull private LocalDateTime createdAt;
    @NotBlank private String phone;
    @NotBlank private String pricePerDay;
    @NotNull private CarDto carDto;

    public static PostDto toDto(Post post) {
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setCreatedAt(post.getCreatedAt());
        postDto.setPhone(postDto.getPhone());
        postDto.setPricePerDay(postDto.getPricePerDay());
        postDto.setCarDto(CarDto.toDto(post.getCar()));
        return postDto;
    }
}
