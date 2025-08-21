package com.mjc813.food_web.member.dto;

import com.mjc813.food_web.common.ERole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDto implements IMember {
    private Long Id;

    @Size(min = 2, max = 20)
    private String name;

    @Size(min = 2, max = 20)
    private String userId;

    @Size(min = 2, max = 20)
    private String passwd;

    @Size(min = 2, max = 20)
    private String nickName;

    @Size(min = 2, max = 15)
    private String phoneNumber;

    @Size(min = 2, max = 50)
    @Email
    private String email;

    private String role;
}
