package com.example.coffee.mybatis;

import com.example.coffee.dto.CoffeeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ICoffeeMybatisMapper {
    public void insertCoffee(CoffeeDto dto);
    public List<CoffeeDto> fineAllCoffee();
    public CoffeeDto findCoffee(Long id);
    public void changeCoffee(CoffeeDto dto);
    public void deleteCoffee(Long id);
}
