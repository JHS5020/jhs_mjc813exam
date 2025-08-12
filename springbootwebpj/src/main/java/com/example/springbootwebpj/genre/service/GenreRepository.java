package com.example.springbootwebpj.genre.service;

import com.example.springbootwebpj.genre.dto.GenreEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<GenreEntity, Long> {
    Page<GenreEntity> findByNameContains(String name, Pageable pageable);
}
