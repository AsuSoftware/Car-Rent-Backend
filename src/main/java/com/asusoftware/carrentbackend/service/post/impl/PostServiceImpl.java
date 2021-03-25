package com.asusoftware.carrentbackend.service.post.impl;

import com.asusoftware.carrentbackend.dto.post.CreatePostDto;
import com.asusoftware.carrentbackend.dto.post.PostDto;
import com.asusoftware.carrentbackend.service.post.PostCreator;
import com.asusoftware.carrentbackend.service.post.PostFinder;
import com.asusoftware.carrentbackend.service.post.PostRemoval;
import com.asusoftware.carrentbackend.service.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * car-rent-backend Created by Antonio on 3/25/2021
 */
@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostCreator postCreator;
    private final PostFinder postFinder;
    private final PostRemoval postRemoval;

    @Override
    public void create(UUID id, CreatePostDto createPostDto) {
        postCreator.create(id, createPostDto);
    }

    @Override
    public List<PostDto> findAll() {
        return postFinder.findAll().stream().map(PostDto::toDto).collect(Collectors.toList());
    }

    @Override
    public void delete(UUID id) {
        postRemoval.delete(id);
    }
}
