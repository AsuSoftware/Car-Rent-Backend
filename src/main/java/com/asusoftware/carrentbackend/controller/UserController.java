package com.asusoftware.carrentbackend.controller;

import com.asusoftware.carrentbackend.dto.user.CreateUserDto;
import com.asusoftware.carrentbackend.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/24/2021
 */
@RestController
@RequestMapping(path = "/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping(path = "/create")
    public void create(@Valid @RequestBody CreateUserDto createUserDto) {
        userService.create(createUserDto);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable(name = "id") UUID id) {
        userService.delete(id);
    }
}
