package com.example.webcrud.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMemberMybatis {
    public void addMember(MemberDto obj);

}
