package com.example.band_jpa.band.controller;


import com.example.band_jpa.band.dto.BandEntity;
import com.example.band_jpa.band.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/band")
public class BandRestController {
    @Autowired
    private BandService bandService;

    @PostMapping("")
    public ResponseEntity<BandEntity> insert(@Validated @RequestBody BandEntity dto) {
        this.bandService.insert(dto);
    }
}
