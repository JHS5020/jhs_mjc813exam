package com.example.webcrud.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberRepository {
    @Autowired
    private IMemberMybatis mybatisMapper;

    public void addMember(MemberDto member) {
        this.mybatisMapper.addMember(member);
    }
}
