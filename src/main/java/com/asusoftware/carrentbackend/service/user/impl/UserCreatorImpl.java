package com.asusoftware.carrentbackend.service.user.impl;

import com.asusoftware.carrentbackend.dto.user.CreateUserDto;
import com.asusoftware.carrentbackend.repository.UserRepository;
import com.asusoftware.carrentbackend.service.user.UserCreator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/24/2021
 */
@Service
@RequiredArgsConstructor
public class UserCreatorImpl implements UserCreator {

    private final UserRepository userRepository;

    @Override
    public void create(CreateUserDto createUserDto) {
        userRepository.save(CreateUserDto.toEntity(createUserDto));
    }

    @Override
    public void delete(UUID id) {
        userRepository.deleteById(id);
    }
}
