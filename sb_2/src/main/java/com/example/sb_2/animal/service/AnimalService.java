package com.example.sb_2.animal.service;

import com.example.sb_2.animal.dto.AnimalDto;
import com.example.sb_2.animal.mybatis.IAnimalMybatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    @Autowired
    IAnimalMybatisMapper animalMapper;

    public void insert(AnimalDto dto) {
        this.animalMapper.insertAnimal(dto);
    }
    public List<AnimalDto> findAll(){
        List<AnimalDto> all = this.animalMapper.findAll();
        return all;
    }
    public AnimalDto findById(Long id) {
        return this.animalMapper.findById(id);
    }
    public void update(AnimalDto dto){
        this.animalMapper.update(dto);
    }
    public void delete(Long id) {
        this.animalMapper.delete(id);
    }
}
