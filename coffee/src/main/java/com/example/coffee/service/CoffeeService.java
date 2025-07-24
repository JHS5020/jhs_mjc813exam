package com.example.coffee.service;

import com.example.coffee.dto.CoffeeDto;
import com.example.coffee.mybatis.ICoffeeMybatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService {
    @Autowired
    private ICoffeeMybatisMapper coffeeMybatisMapper;

    public void insertCoffee(CoffeeDto dto) {
        this.coffeeMybatisMapper.insertCoffee(dto);
    }

    public List<CoffeeDto> fineAllCoffee(){
        List<CoffeeDto> coffeeDtos = this.coffeeMybatisMapper.fineAllCoffee();
        return coffeeDtos;
    }

    public CoffeeDto findCoffee(Long id){
        CoffeeDto coffeeDto = this.coffeeMybatisMapper.findCoffee(id);
        return coffeeDto;
    }
}
