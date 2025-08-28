package com.mjc813.swimpool_app.user.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_tbl")
public class UserEntity implements IUser{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private Integer maxLock;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(nullable = false, length = 20, unique = true)
    private String username;

    @Column(nullable = false, length = 200)
    private String password;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(nullable = true, length = 200)
    private String phoneNumber;

    @Column(nullable = false, length = 20)
    private String role;
}
