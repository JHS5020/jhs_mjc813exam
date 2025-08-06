package com.example.food_jpa.food_category.controller;

import com.example.food_jpa.food_category.service.FoodCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("foodCategory")
public class FoodCategoryRestController {
    @Autowired
    private FoodCategoryService foodCategoryService;

//    @PostMapping("")
//    public ResponseEntity<FoodCategoryDto> insert(@Validated @RequestBody FoodCategoryDto foodCategoryDto) {
//
//    }
}
