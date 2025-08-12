package com.example.springbootwebpj.song.dto;


import com.example.springbootwebpj.genre.dto.GenreEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "song_tb")
public class SongEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String title;

    @ManyToOne
    @JoinColumn(name = "genre_id", nullable = false)
    private GenreEntity genre;

    @Column(nullable = false, length = 50)
    private String composer;

    @Column(nullable = false, length = 50)
    private String artist;

    private LocalDate releaseDate;
}
