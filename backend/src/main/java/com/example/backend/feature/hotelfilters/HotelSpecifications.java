package com.example.backend.feature.hotelfilters;

import com.example.backend.domain.*;
import com.example.backend.feature.hotelfilters.dto.HotelFilterRequestDto;
import org.springframework.data.jpa.domain.Specification;

import jakarta.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;

public class HotelSpecifications {

    public static Specification<Hotel> withFilters(HotelFilterRequestDto request) {
        return (root, query, cb) -> {
            query.distinct(true); // 중복 호텔 제거

            List<Predicate> predicates = new ArrayList<>();

            // === 도시 이름 ===
            if (request.getCityName() != null) {
                predicates.add(cb.equal(root.get("city").get("cityName"), request.getCityName()));
            }

            // === Room & Reservation JOIN ===
            Join<Hotel, Room> rooms = root.join("rooms", JoinType.LEFT);
            Join<Room, Reservation> reservations = rooms.join("reservations", JoinType.LEFT);

            // === 예약 날짜 필터: 예약이 겹치지 않는 방만 ===
            if (request.getCheckInDate() != null && request.getCheckOutDate() != null) {
                Predicate overlap = cb.and(
                        cb.lessThan(reservations.get("checkInDate"), request.getCheckOutDate()),
                        cb.greaterThan(reservations.get("checkOutDate"), request.getCheckInDate())
                );
                predicates.add(cb.or(cb.isNull(reservations.get("id")), cb.not(overlap)));
            }

            // === 최소 예약 가능한 방 수 (roomsGuest 기준) ===
            if (request.getMinAvailableRooms() != null) {
                query.groupBy(root.get("id"));
                predicates.add(cb.ge(cb.count(rooms.get("id")), request.getMinAvailableRooms()));
            }

            // === 기존 무료서비스/편의시설 필터 ===
            Join<Hotel, Freebies> freebies = root.join("freebies", JoinType.LEFT);
            Join<Hotel, Amenities> amenities = root.join("amenities", JoinType.LEFT);

            if (Boolean.TRUE.equals(request.getBreakfastIncluded())) {
                predicates.add(cb.isTrue(freebies.get("breakfastIncluded")));
            }
            if (Boolean.TRUE.equals(request.getFreeParking())) {
                predicates.add(cb.isTrue(freebies.get("freeParking")));
            }
            if (Boolean.TRUE.equals(request.getFreeWifi())) {
                predicates.add(cb.isTrue(freebies.get("freeWifi")));
            }
            if (Boolean.TRUE.equals(request.getAirportShuttlebus())) {
                predicates.add(cb.isTrue(freebies.get("airportShuttlebus")));
            }
            if (Boolean.TRUE.equals(request.getFreeCancellation())) {
                predicates.add(cb.isTrue(freebies.get("freeCancellation")));
            }

            if (Boolean.TRUE.equals(request.getFrontDesk24())) {
                predicates.add(cb.isTrue(amenities.get("frontDesk24")));
            }
            if (Boolean.TRUE.equals(request.getAirConditioner())) {
                predicates.add(cb.isTrue(amenities.get("airConditioner")));
            }
            if (Boolean.TRUE.equals(request.getFitnessCenter())) {
                predicates.add(cb.isTrue(amenities.get("fitnessCenter")));
            }
            if (Boolean.TRUE.equals(request.getPool())) {
                predicates.add(cb.or(
                        cb.isTrue(amenities.get("indoorPool")),
                        cb.isTrue(amenities.get("outdoorPool"))
                ));
            }

            // === 등급 필터 ===
            if (request.getMinGrade() != null) {
                predicates.add(cb.greaterThanOrEqualTo(root.get("grade"), request.getMinGrade()));
            }

            // === 가격 필터 (최저가) ===
            if (request.getMinPrice() != null) {
                predicates.add(cb.greaterThanOrEqualTo(rooms.get("price"), request.getMinPrice()));
            }
            if (request.getMaxPrice() != null) {
                predicates.add(cb.lessThanOrEqualTo(rooms.get("price"), request.getMaxPrice()));
            }

            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}
