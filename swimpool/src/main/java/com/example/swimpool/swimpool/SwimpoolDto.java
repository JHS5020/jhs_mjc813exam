package com.example.swimpool.swimpool;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SwimpoolDto {
    private Long id;
    private String name;
    private String ranes;
    private String raneType;
    private String phoneNumber;
    private String addr;
}
