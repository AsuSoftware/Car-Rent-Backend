package com.asusoftware.carrentbackend.controller;

import com.asusoftware.carrentbackend.dto.post.CreatePostDto;
import com.asusoftware.carrentbackend.dto.post.PostDto;
import com.asusoftware.carrentbackend.service.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/25/2021
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/posts")
public class PostController {

    private final PostService postService;

    @PostMapping(path = "/create/{id}")
    public void create(@PathVariable(name = "id") UUID id, @Valid @RequestBody CreatePostDto createPostDto) {
        postService.create(id, createPostDto);
    }

    @GetMapping
    public List<PostDto> findAll() {
       return postService.findAll();
    }
}
