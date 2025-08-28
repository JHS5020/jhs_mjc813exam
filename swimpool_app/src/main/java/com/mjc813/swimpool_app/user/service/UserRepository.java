package com.mjc813.swimpool_app.user.service;

import com.mjc813.swimpool_app.user.dto.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
