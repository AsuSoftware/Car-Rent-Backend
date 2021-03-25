package com.asusoftware.carrentbackend.service.user.impl;

import com.asusoftware.carrentbackend.dto.user.CreateUserDto;
import com.asusoftware.carrentbackend.service.user.UserCreator;
import com.asusoftware.carrentbackend.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/24/2021
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserCreator userCreator;

    @Override
    public void create(CreateUserDto createUserDto) {
        userCreator.create(createUserDto);
    }

    @Override
    public void delete(UUID id) {
        userCreator.delete(id);
    }
}
