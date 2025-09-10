package com.example.backend.feature.hotelfilters;

import com.example.backend.domain.Hotel;
import com.example.backend.feature.hotelfilters.dto.HotelDto;
import com.example.backend.feature.hotelfilters.dto.HotelFilterRequestDto;
import com.example.backend.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class HotelFiltersService {

    private final HotelRepository hotelRepository;

    public Page<HotelDto> filterHotels(HotelFilterRequestDto request, Pageable pageable) {
        // Specification으로 DB에서 필터 적용
        Specification<Hotel> spec = HotelSpecifications.withFilters(request);

        // DB에서 필터 + 페이징 처리
        Page<Hotel> hotelPage = hotelRepository.findAll(spec, pageable);

        // DTO 변환
        return hotelPage.map(h -> new HotelDto(
                h.getId(),
                h.getName(),
                h.getCity().getCityName(),
                h.getGrade(),
                countAmenities(h),
                getLowestPrice(h),
                getRepresentativeImage(h)
        ));
    }

    // 호텔이 가지고 있는 무료서비스 + 편의시설 카운트
    private int countAmenities(Hotel h) {
        int count = 0;
        // Freebies
        if (h.getFreebies().isBreakfastIncluded()) count++;
        if (h.getFreebies().isFreeParking()) count++;
        if (h.getFreebies().isFreeWifi()) count++;
        if (h.getFreebies().isAirportShuttlebus()) count++;
        if (h.getFreebies().isFreeCancellation()) count++;

        // Amenities
        if (h.getAmenities().isFrontDesk24()) count++;
        if (h.getAmenities().isAirConditioner()) count++;
        if (h.getAmenities().isFitnessCenter()) count++;
        if (h.getAmenities().isOutdoorPool() || h.getAmenities().isIndoorPool()) count++; // 수영장 합치기
        if (h.getAmenities().isSpaWellnessCenter()) count++;
        if (h.getAmenities().isRestaurant()) count++;
        if (h.getAmenities().isRoomservice()) count++;
        if (h.getAmenities().isBarLounge()) count++;
        if (h.getAmenities().isTeaCoffeeMachine()) count++;

        return count;
    }

    private BigDecimal getLowestPrice(Hotel h) {
        return h.getRooms().stream()
                .map(r -> r.getPrice())
                .min(BigDecimal::compareTo)
                .orElse(BigDecimal.ZERO);
    }

    private String getRepresentativeImage(Hotel h) {
        // 임시 이미지
        return "https://example.com/default-image.jpg";
    }
}
