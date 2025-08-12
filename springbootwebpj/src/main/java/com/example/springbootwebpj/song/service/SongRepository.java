package com.example.springbootwebpj.song.service;


import com.example.springbootwebpj.song.dto.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<SongEntity, Long> {
}
