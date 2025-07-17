package com.example.sb_2.gugudan;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/test")
public class GugudanController {
    @GetMapping("/gugudan1")
    public String viewGugudan1(Model model, @RequestParam("num") Integer number) {
        List<String> array = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            array.add(String.format("%d X %d = %d", number, i , number*i));
        }
        model.addAttribute("number", number);
        model.addAttribute("array", array);
        return "/gugudan/listview";
    }

    @GetMapping("/gugudan2/{number}")
    public String viewGugudan2(Model model, @PathVariable("number") Integer num){
        List<String> array = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            array.add(String.format("%d X %d = %d", num, i , num*i));
        }
        model.addAttribute("number", num);
        model.addAttribute("array", array);
        return "/gugudan/listview";
    }
}
