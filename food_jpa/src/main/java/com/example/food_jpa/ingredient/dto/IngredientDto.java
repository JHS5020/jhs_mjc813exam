package com.example.food_jpa.ingredient.dto;

import com.mjc813.food_web.common.IIdName;
import com.mjc813.food_web.ingredient_category.dto.IngredientCategoryDto;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IngredientDto implements IIngredient {
    private Long id;
    private String name;
    private Long ingredientCategoryId;
    private IngredientCategoryDto ingredientCategoryDto;

    @Override
    public IIdName getIngredientCategory() {
        return this.ingredientCategoryDto;
    }

    @Override
    public void setIngredientCategory(IIdName ingredientCategory) {
        if( this.ingredientCategoryDto == null ) {
            this.ingredientCategoryDto = new IngredientCategoryDto();
        }
        this.ingredientCategoryDto.copyMembersIdName(ingredientCategory);
    }
}
