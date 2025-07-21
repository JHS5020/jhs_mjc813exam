package com.example.sb_2.animal.mybatis;


import com.example.sb_2.animal.dto.AnimalDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IAnimalMybatisMapper {

    public void insertAnimal(AnimalDto dto);
    public List<AnimalDto> findAll();
    public AnimalDto findById(Long id);
    public void update(AnimalDto dto);
    public void delete(Long id);
}
