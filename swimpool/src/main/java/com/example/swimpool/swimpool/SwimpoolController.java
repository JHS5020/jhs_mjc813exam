package com.example.swimpool.swimpool;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class SwimpoolController {
    @Autowired
    private SwimpoolService swimpoolService;

    @GetMapping("/swiming/")
    public String swim(){
        return "/swimpool/list";
    }
}