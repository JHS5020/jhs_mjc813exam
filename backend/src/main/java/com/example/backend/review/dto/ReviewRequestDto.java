package com.example.backend.review.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ReviewRequestDto {
    private Long userId; // 리뷰를 작성하는 사용자의 ID
    private String content;
    private Double userRatingScore;

}
