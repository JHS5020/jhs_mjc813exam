package com.example.backend.feature.hotelfilters.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HotelFilterRequestDto {
    // 첫 페이지: 예약 가능 관련
    private String cityName;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Integer minAvailableRooms; // 최소 예약 가능한 객실 수

    // 기존 필터
    private Boolean breakfastIncluded;
    private Boolean freeParking;
    private Boolean freeWifi;
    private Boolean airportShuttlebus;
    private Boolean freeCancellation;

    private Boolean frontDesk24;
    private Boolean airConditioner;
    private Boolean fitnessCenter;
    private Boolean pool;

    private Integer minGrade;
    private BigDecimal minPrice;
    private BigDecimal maxPrice;
}

