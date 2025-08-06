package com.example.food_jpa.common;

public interface IIdName {
    Long getId();
    void setId(Long id);

    String getName();
    void setName(String name);

    default void copyMembers(IFoodCategory ifoodCategory) {
        if(ifoodCategory == null){
            return;
        }
        this.setId(ifoodCategory.getId());
        this.setName(ifoodCategory.getName());
    }
}
