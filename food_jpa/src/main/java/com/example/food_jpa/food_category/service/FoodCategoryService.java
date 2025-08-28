package com.example.food_jpa.food_category.service;

import com.example.food_jpa.food_category.dto.FoodCategoryDto;
import com.example.food_jpa.food_category.dto.FoodCategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodCategoryService {
    @Autowired
    private FoodCategoryRepository foodCategoryRepository;

    public FoodCategoryEntity insert(FoodCategoryDto foodCategoryDto) {
        FoodCategoryEntity foodCategoryEntity = new FoodCategoryEntity(null, foodCategoryDto.getName());
        this.foodCategoryRepository.save(foodCategoryEntity);
        return foodCategoryEntity;
    }
}
