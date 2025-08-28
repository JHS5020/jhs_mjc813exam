package com.mjc813.swimpool_app.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto implements IUser{
    private Long id;
    private Integer maxLock;

    @Size(min = 2, max = 20)
    private String name;

    @Size(min = 2, max = 20)
    private String username;

    @Size(min = 2, max = 20)
    private String password;

    @Size(min = 2, max = 20)
    @Email
    private String email;

    @Size(min = 2, max = 20)
    private String phoneNumber;

    @Size(min = 2, max = 20)
    private String role;

}
