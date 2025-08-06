package com.example.food_jpa.ingredient_category.dto;

import com.example.food_jpa.common.IIdName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IngredientCategoryDto implements IIdName {
    private Long id;
}
