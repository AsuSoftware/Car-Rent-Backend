package com.asusoftware.carrentbackend.dto.user;

import com.asusoftware.carrentbackend.model.User;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * car-rent-backend Created by Antonio on 3/24/2021
 */
@Getter
@Setter
public class CreateUserDto {
    @NotBlank private String firstName;
    @NotBlank private String lastName;
    @NotBlank @Email private String email;
    @NotNull private LocalDateTime birthday;
    @NotBlank private String password;
    @NotBlank private String profileImage;

    public static User toEntity(CreateUserDto createUserDto) {
        User user = new User();
        user.setFirstName(createUserDto.getFirstName());
        user.setLastName(createUserDto.getLastName());
        user.setEmail(createUserDto.getEmail());
        user.setBirthday(createUserDto.getBirthday());
        user.setPassword(createUserDto.getPassword());
        user.setProfileImage(createUserDto.getProfileImage());
        return user;
    }
}
