package com.mjc813.food_web.common;

import com.mjc813.food_web.food.dto.FoodIngsResponseDto;
import com.mjc813.food_web.food.dto.IFood;
import com.mjc813.food_web.food.service.FoodJpaTransactionService;
import com.mjc813.food_web.food.service.FoodService;
import com.mjc813.food_web.member.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MenuController {

    @Autowired
    private FoodJpaTransactionService foodJpaTransactionService;

    private String checkLogin(Model model, String url) {
        MemberDto loginUser = (MemberDto)model.getAttribute("loginUser");
        if ( loginUser == null ) {
            return "redirect:/sign";
        }
        return url;
    }

    @GetMapping("/food_category")
    public String menuFoodCategory(Model model) {
        return this.checkLogin(model, "/food/food_category");
    }

    @GetMapping("/ingredient_category")
    public String menuIngredientCategory(Model model) {
        return this.checkLogin(model, "/food/ingredient_category");
    }

    @GetMapping("/ingredient")
    public String menuIngredient(Model model) {
        return this.checkLogin(model, "/food/ingredient");
    }

    @GetMapping("/food")
    public String menuFood(Model model) {
        return this.checkLogin(model, "/food/food");
    }

    @GetMapping("/member")
    public String member(Model model) {
        return this.checkLogin(model, "member/members");
    }

    @GetMapping("/sign")
    public String everyone() {
        return "sign/home";
    }

    @GetMapping("/main")
    public String mainHome(Model model) {
        try {
            List<FoodIngsResponseDto> all = this.foodJpaTransactionService.getFoodsAndIngredientList();
            model.addAttribute("foodList", all);
            return "main/home";
        } catch ( Throwable e ) {
            return "error/500";
        }
    }
}
