package com.asusoftware.carrentbackend.service.user;

import com.asusoftware.carrentbackend.model.User;

import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/25/2021
 */
public interface UserFinder {
    User findUserById(UUID id);
}
