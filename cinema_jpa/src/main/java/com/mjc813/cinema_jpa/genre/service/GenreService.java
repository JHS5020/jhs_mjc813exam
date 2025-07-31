package com.mjc813.cinema_jpa.genre.service;

import com.mjc813.cinema_jpa.genre.dto.GenreDto;
import com.mjc813.cinema_jpa.genre.dto.GenreEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService {
    @Autowired
    private GenreRepository GenreRepository;

    public void insert(GenreDto dto) {
        GenreEntity entity = new GenreEntity(null, dto.getName());
        this.GenreRepository.save(entity);
    }

    public void update(GenreDto dto) {
        GenreEntity entity = new GenreEntity(null, dto.getName());
        this.GenreRepository.save(entity);
    }
}
