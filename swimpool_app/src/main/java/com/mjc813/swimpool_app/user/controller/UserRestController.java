package com.mjc813.swimpool_app.user.controller;

import com.mjc813.swimpool_app.common.ResponseDto;
import com.mjc813.swimpool_app.common.ResponseEnum;
import com.mjc813.swimpool_app.user.dto.UserDto;
import com.mjc813.swimpool_app.user.dto.UserEntity;
import com.mjc813.swimpool_app.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserRestController {
    @Autowired
    private UserService userService;

    private ResponseDto getResponseDto(Integer code, ResponseEnum responseEnum, Object data) {
        return ResponseDto.builder()
                .responseEnum(responseEnum)
                .code(code)
                .data(data)
                .build();
    }

    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(@Validated @RequestBody UserDto userDto) {
        UserEntity Entity = this.userService.insert(userDto);
        return ResponseEntity.ok(this.getResponseDto(0,ResponseEnum.Success,Entity));
    }
}
