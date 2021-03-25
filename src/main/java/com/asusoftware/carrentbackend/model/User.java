package com.asusoftware.carrentbackend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * car-rent-backend Created by Antonio on 3/24/2021
 */
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Column(name = "first_name")
    private String firstName;

    @NotBlank
    @Column(name = "last_name")
    private String lastName;

    @Email
    @NotBlank
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "birthday")
    private LocalDateTime birthday;

    @NotBlank
    @Column(name = "password")
    private String password;

    @NotBlank
    @Column(name = "profile_image")
    private String profileImage;

    @NotNull
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<Post> posts;
}
