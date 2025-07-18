package com.example.webcrud.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/member/")
    public String member(){
        return "/member/index";
    }
    @GetMapping("member/add")
    public String memberAdd(){
        return "/member/add";
    }

    @PostMapping("/member/insert")
    public String memberInsert(@ModelAttribute MemberDto obj){
        this.memberRepository.addMember(obj);
        return "redirect:/member/";
    }
}
