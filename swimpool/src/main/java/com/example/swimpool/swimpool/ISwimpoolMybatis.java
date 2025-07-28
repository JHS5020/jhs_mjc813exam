package com.example.swimpool.swimpool;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ISwimpoolMybatis {
    public void addSwimpool(SwimpoolDto dto);
    public List<SwimpoolDto> findAll();
    public SwimpoolDto findSwimpool(Integer id);
    public void updateSwimpool(SwimpoolDto dto);
    public void deleteSwimpool(Integer id);
}