package com.example.springbootwebpj.song.service;


import com.example.springbootwebpj.genre.dto.GenreEntity;
import com.example.springbootwebpj.song.dto.SongEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<SongEntity, Long> {
    Page<SongEntity> findByNameContains(String name, Pageable pageable);
}
