package com.asusoftware.carrentbackend.service.user.impl;

import com.asusoftware.carrentbackend.exception.UserNotFoundException;
import com.asusoftware.carrentbackend.model.User;
import com.asusoftware.carrentbackend.repository.UserRepository;
import com.asusoftware.carrentbackend.service.user.UserFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/25/2021
 */
@Service
@RequiredArgsConstructor
public class UserFinderImpl implements UserFinder {

    private final UserRepository userRepository;

    @Override
    public User findUserById(UUID id) {
        return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }
}
