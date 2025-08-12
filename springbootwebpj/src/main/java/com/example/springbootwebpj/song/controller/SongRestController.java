package com.example.springbootwebpj.song.controller;


import com.example.springbootwebpj.common.ResponseDto;
import com.example.springbootwebpj.song.dto.SongEntity;
import com.example.springbootwebpj.song.service.SongRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Slf4j
@RestController
@RequestMapping("/song")
public class SongRestController {
    @Autowired
    private SongRepository songRepository;

    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(@RequestBody SongEntity entity) {
        try {
            this.songRepository.save(entity);
            return ResponseEntity.ok().body(
                    ResponseDto.builder().resultCode(999).message("ERROR")
                            .resultData(entity).build()
            );
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(
                    ResponseDto.builder().resultCode(999).message("ERROR")
                            .resultData(entity).build()
            );
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<SongEntity> findById(@PathVariable Long id) {
        try {
            Optional<SongEntity> find = this.songRepository.findById(id);
            if( find.isPresent() ) {
                return ResponseEntity.ok().body(find.orElse(null));
            } else{
                return ResponseEntity.notFound().build();
            }

        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(null);
        }
    }

    @GetMapping("")
    public ResponseEntity<Page<SongEntity>> findByTitleContains(@RequestParam String title, Pageable pageable) {
        try {
            Page<SongEntity> list = this.songRepository.findByTitleContains(title, pageable);
            return ResponseEntity.ok().body(list);
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(null);
        }
    }


    @PatchMapping("/{id}")
    public ResponseEntity<SongEntity> update(@RequestBody SongEntity entity) {
        try {
            this.songRepository.save(entity);
            return ResponseEntity.ok().body(entity);
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(entity);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable Long id) {
        try {
            this.songRepository.deleteById(id);
            return ResponseEntity.ok().body(id);
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(id);
        }
    }

}
