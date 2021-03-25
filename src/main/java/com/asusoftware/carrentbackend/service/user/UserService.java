package com.asusoftware.carrentbackend.service.user;

import com.asusoftware.carrentbackend.dto.user.CreateUserDto;

import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/24/2021
 */
public interface UserService {
    void create(CreateUserDto createUserDto);
    void delete(UUID id);
}
