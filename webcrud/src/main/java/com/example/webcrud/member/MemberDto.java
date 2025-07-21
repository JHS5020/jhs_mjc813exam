package com.example.webcrud.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private Long Id;
    private String userId;
    private String passwd;
    private String name;
    private String nickName;
}
