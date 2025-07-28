package com.example.swimpool.swimpool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SwimpoolService {
    @Autowired
    private ISwimpoolMybatis swimpoolMybatis;

    public SwimpoolDto addSwimpool(SwimpoolDto dto){
        this.swimpoolMybatis.addSwimpool(dto);
        return dto;
    }

    public List<SwimpoolDto> findAll() {
        List<SwimpoolDto> all = this.swimpoolMybatis.findAll();
        return all;
    }

    public SwimpoolDto findSwimpool(Integer id){
        return this.swimpoolMybatis.findSwimpool(id);
    }

    public SwimpoolDto updateSwimpool(SwimpoolDto dto){
        this.swimpoolMybatis.updateSwimpool(dto);
        return dto;
    }

    public void deleteSwimpool(Integer id){
        this.swimpoolMybatis.deleteSwimpool(id);
    }
}
