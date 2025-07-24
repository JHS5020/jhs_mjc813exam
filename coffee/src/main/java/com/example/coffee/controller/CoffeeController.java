package com.example.coffee.controller;

import com.example.coffee.dto.CoffeeDto;
import com.example.coffee.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        try {
            this.coffeeService.insertCoffee(dto);
        } catch (Throwable e) {
            System.out.println(e.toString());
        }
        return "/coffe/addview";
    }

    @GetMapping("/list")
    public String list(Model model) {
        try {
            List<CoffeeDto>  coffeeDtos = this.coffeeService.fineAllCoffee();
            model.addAttribute("ListCoffee", coffeeDtos);
        } catch (Throwable e) {
            System.out.println(e.toString());
        }
        return "/coffe/findall";
    }

    @GetMapping("/find")
    public String find(@RequestParam("id") Long id, Model model) {
        try {
            CoffeeDto coffeeDto = this.coffeeService.findCoffee(id);
            model.addAttribute("data", coffeeDto);
        } catch (Throwable e) {
            System.out.println(e.toString());
        }
        return "/coffe/find";
    }
}
