package com.example.coffee.controller;

import com.example.coffee.dto.CoffeeDto;
import com.example.coffee.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/coffee")
public class CoffeeController {
    @Autowired
    private CoffeeService coffeeService;


    @GetMapping("/addview")
    public String addView(){
        return "/coffe/addview";
    }


    @PostMapping("/insert")
    public String insert(@ModelAttribute CoffeeDto dto) {
        this.coffeeService.insertCoffee(dto);
        return "/coffe/addview";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<CoffeeDto>  coffeeDtos = this.coffeeService.fineAllCoffee();
        model.addAttribute("ListCoffee", coffeeDtos);
        return "/coffe/findall";
    }
}
