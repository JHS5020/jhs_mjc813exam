package com.example.band_jpa.band.service;

import com.example.band_jpa.band.dto.BandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "api_band")
public interface BandRepository extends JpaRepository<BandEntity, Long> {
}
