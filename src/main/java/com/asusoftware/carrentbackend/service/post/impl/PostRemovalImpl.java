package com.asusoftware.carrentbackend.service.post.impl;

import com.asusoftware.carrentbackend.service.post.PostRemoval;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/25/2021
 */
@Service
@RequiredArgsConstructor
public class PostRemovalImpl implements PostRemoval {

    private final PostRemoval postRemoval;

    @Override
    public void delete(UUID id) {
        postRemoval.delete(id);
    }
}
