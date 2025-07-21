package com.example.sb_2.animal.controller;


import com.example.sb_2.animal.dto.AnimalDto;
import com.example.sb_2.animal.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/animal")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping("/a")
    public String testA(Model model, @RequestParam("name1") String name1   // @RequestParam : http 클라이언트에서 보낸 변수=값 형태를 받아들일수 있다.
            , @RequestParam("name2") String name2
            , @RequestParam("n3") String nam3) {
        model.addAttribute("name1", name1); // 화면텝플릿의 name1 이라는 키단어를 name1 변수값으로 치환한다.
        model.addAttribute("name2", name2); // 화면텝플릿의 name2 이라는 키단어를 name2 변수값으로 치환한다.
        model.addAttribute("n3", nam3); // 화면텝플릿의 nam3 이라는 키단어를 nm3 변수값으로 치환한다.
        return "/a";
    }

    @GetMapping("/addview")
    public String addView(){
        return "/animal/addview";
    }

    @PostMapping("/insert")
    public String insert(@ModelAttribute AnimalDto animal) {
        try {
            this.animalService.insert(animal);
        }  catch (Throwable th) {
            System.out.println(th.toString());
        }
        return "redirect:/";
    }
    @GetMapping("/list")
    public String list(Model model) {
        try {
            List<AnimalDto> all = this.animalService.findAll();
            model.addAttribute("ListWord", all);
        } catch (Throwable e) {
            System.out.println(e.toString());
        }
        return "/animal/list";
    }

    @GetMapping("/view")
    public String view1(Model model
            , @RequestParam("id") Long id) {
        try {
            AnimalDto byId = this.animalService.findById(id);
            model.addAttribute("data", byId);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return "/animal/view";
    }
    @GetMapping("/modify")
    public String modify(Model model, @RequestParam("id") Long id) {
        try {
            AnimalDto all = this.animalService.findById(id);
            model.addAttribute("one", all);
        } catch (Throwable e) {
            System.out.println(e.toString());
        }
        return "/animal/modify";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute AnimalDto animal) {
        this.animalService.update(animal);
        return "redirect:/animal/list";
    }
    @GetMapping("/delete")
    public String delete(Model model, @RequestParam("id") Long id) {
        try {
            AnimalDto all = this.animalService.findById(id);
            model.addAttribute("one", all);
        } catch (Throwable e) {
            System.out.println(e.toString());
        }
        return "/animal/delete";
    }
    @PostMapping("/delete")
    public String delete(@ModelAttribute AnimalDto animal) {
        this.animalService.delete(animal.getId());
        return "redirect:/animal/list";
    }
}
