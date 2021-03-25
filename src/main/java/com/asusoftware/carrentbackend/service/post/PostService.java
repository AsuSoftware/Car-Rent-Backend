package com.asusoftware.carrentbackend.service.post;

import com.asusoftware.carrentbackend.dto.post.CreatePostDto;
import com.asusoftware.carrentbackend.dto.post.PostDto;

import java.util.List;
import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/25/2021
 */
public interface PostService {
    void create(UUID id, CreatePostDto createPostDto);
    List<PostDto> findAll();
    void delete(UUID id);
}
