package com.asusoftware.carrentbackend.service.post;

import com.asusoftware.carrentbackend.model.Post;

import java.util.List;

/**
 * car-rent-backend Created by Antonio on 3/25/2021
 */
public interface PostFinder {
    List<Post> findAll();
}
