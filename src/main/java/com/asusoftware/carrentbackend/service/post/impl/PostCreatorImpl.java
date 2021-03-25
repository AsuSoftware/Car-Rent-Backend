package com.asusoftware.carrentbackend.service.post.impl;

import com.asusoftware.carrentbackend.dto.post.CreatePostDto;
import com.asusoftware.carrentbackend.model.Post;
import com.asusoftware.carrentbackend.model.User;
import com.asusoftware.carrentbackend.repository.PostRepository;
import com.asusoftware.carrentbackend.service.post.PostCreator;
import com.asusoftware.carrentbackend.service.user.UserFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/25/2021
 */
@Service
@RequiredArgsConstructor
public class PostCreatorImpl implements PostCreator {

    private final PostRepository postRepository;
    private final UserFinder userFinder;

    @Override
    public void create(UUID id, CreatePostDto createPostDto) {
        User user = userFinder.findUserById(id);
        Post post = CreatePostDto.toEntity(createPostDto);
        post.setUser(user);
        postRepository.save(post);
    }
}
