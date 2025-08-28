package com.mjc813.swimpool_app.user.service;


import com.mjc813.swimpool_app.user.dto.IUser;
import com.mjc813.swimpool_app.user.dto.UserDto;
import com.mjc813.swimpool_app.user.dto.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity insert(UserDto dto){
        UserEntity entity = new UserEntity();
        entity.copyUsers(dto);
        this.userRepository.save(entity);
        return entity;
    }
}
