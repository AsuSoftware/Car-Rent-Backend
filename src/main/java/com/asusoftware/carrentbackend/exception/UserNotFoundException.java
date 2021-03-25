package com.asusoftware.carrentbackend.exception;

/**
 * car-rent-backend Created by Antonio on 3/25/2021
 */
public class UserNotFoundException extends CarRentException {

    public UserNotFoundException() {
        super("User not found!");
    }
}
