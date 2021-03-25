package com.asusoftware.carrentbackend.service.post;

import com.asusoftware.carrentbackend.dto.post.CreatePostDto;

import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/25/2021
 */
public interface PostCreator {
    void create(UUID id, CreatePostDto createPostDto);
}
