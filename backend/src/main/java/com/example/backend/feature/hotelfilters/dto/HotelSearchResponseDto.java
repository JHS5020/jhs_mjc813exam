package com.example.backend.feature.hotelfilters.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 두번째 페이지에 화면에 보여줄 호텔 정보들
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HotelSearchResponseDto {
    private Long id;
    private String name;
    private String address;
    private int grade;
    private int amenitiesCount;
    private BigDecimal price;
    private String imageUrl;

    // JPQL에서 new 생성자를 사용하기 위한 생성자
    public HotelSearchResponseDto(Long hotelId, String name, String address, int grade, String imageUrl, BigDecimal minPrice) {
        this.id = hotelId;
        this.name = name;
        this.address = address;
        this.grade = grade;
        this.imageUrl = imageUrl;
        this.price = minPrice;
    }
}
