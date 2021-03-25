package com.asusoftware.carrentbackend.exception;

/**
 * car-rent-backend Created by Antonio on 3/25/2021
 */
public class CarRentException extends RuntimeException {

    public CarRentException(String message) {
        super(message);
    }

    public CarRentException(String message, Throwable cause) {
        super(message, cause);
    }

    public CarRentException(Throwable cause) {
        super(cause);
    }

    public CarRentException(
            String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
