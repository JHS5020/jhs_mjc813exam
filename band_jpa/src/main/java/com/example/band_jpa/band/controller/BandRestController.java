package com.example.band_jpa.band.controller;


import com.example.band_jpa.band.dto.BandDto;
import com.example.band_jpa.band.dto.BandEntity;
import com.example.band_jpa.band.service.BandService;
import com.example.band_jpa.common.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/band")
public class BandRestController {
    @Autowired
    private BandService bandService;

    private ResponseDto getResponseDto(String msg, Integer code, Object data) {
        return ResponseDto.builder()
                .message(msg)
                .resultCode(code)
                .resultData(data)
                .build();
    }

    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(@Validated @RequestBody BandDto dto) {
        try {
            BandEntity result = this.bandService.insert(dto);
            return ResponseEntity.ok(
                    this.getResponseDto("성공", 50010, result)
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    this.getResponseDto("실패", 90000, dto)
            );
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ResponseDto> update(@Validated @RequestBody BandEntity dto) {
        this.bandService.update(dto);
        return ResponseEntity.ok().body(
                new ResponseDto("성공",400, dto)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> delete(@PathVariable Long id) {
        this.bandService.delete(id);
        return ResponseEntity.ok().body(
                new ResponseDto("성공",400, true)
        );
    }
}










