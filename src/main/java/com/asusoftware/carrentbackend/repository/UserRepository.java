package com.asusoftware.carrentbackend.repository;

import com.asusoftware.carrentbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/24/2021
 */
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
