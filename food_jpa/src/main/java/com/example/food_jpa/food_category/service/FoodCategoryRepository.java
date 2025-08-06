package com.example.food_jpa.food_category.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path ="api_food_category")
public interface FoodCategoryRepository extends JpaRepository<FoodCategoryEntity, Long> {
}
