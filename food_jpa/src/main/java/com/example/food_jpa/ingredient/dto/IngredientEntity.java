package com.example.food_jpa.ingredient.dto;

import com.mjc813.food_web.common.IIdName;
import com.mjc813.food_web.ingredient_category.dto.IngredientCategoryEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "IngredientEntity")
@Table(name = "ingredient_tbl")
@Builder
public class IngredientEntity implements IIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false, unique = true)
    private String name;

    private Long ingredientCategoryId;

    @ManyToOne
    @JoinColumn(name = "ingredient_category_id")
    private IngredientCategoryEntity ingredientCategoryEntity;

    @Override
    public IIdName getIngredientCategory() {
        return this.ingredientCategoryEntity;
    }

    @Override
    public void setIngredientCategory(IIdName ingredientCategory) {
        if( this.ingredientCategoryEntity == null ) {
            this.ingredientCategoryEntity = new IngredientCategoryEntity();
        }
        this.ingredientCategoryEntity.copyMembersIdName(ingredientCategory);
    }
}
