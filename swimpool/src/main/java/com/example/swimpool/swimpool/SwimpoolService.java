package com.example.swimpool.swimpool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SwimpoolService {
    @Autowired
    private ISwimpoolMybatis swimpoolMybatis;

    public void addSwimpool(SwimpoolDto dto){
        this.swimpoolMybatis.addSwimpool(dto);
    }

    public List<SwimpoolDto> findAll() {
        List<SwimpoolDto> all = this.swimpoolMybatis.findAll();
        return all;
    }

    public SwimpoolDto findSwimpool(Long id){
        return this.swimpoolMybatis.findSwimpool(id);
    }

    public void updateSwimpool(SwimpoolDto dto){
        this.swimpoolMybatis.updateSwimpool(dto);
    }

    public void deleteSwimpool(Long id){
        this.swimpoolMybatis.deleteSwimpool(id);
    }
}
