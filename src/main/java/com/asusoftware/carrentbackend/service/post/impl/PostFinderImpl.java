package com.asusoftware.carrentbackend.service.post.impl;

import com.asusoftware.carrentbackend.model.Post;
import com.asusoftware.carrentbackend.repository.PostRepository;
import com.asusoftware.carrentbackend.service.post.PostFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * car-rent-backend Created by Antonio on 3/25/2021
 */
@Service
@RequiredArgsConstructor
public class PostFinderImpl implements PostFinder {

    private final PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }
}
