package com.mjc813.food_web.member.service;

import com.mjc813.food_web.common.exception.MyDataNotFoundException;
import com.mjc813.food_web.common.exception.MyRequestException;
import com.mjc813.food_web.member.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private IMemberMybatis mybatisMapper;
    @Autowired
    private PasswordEncoder encoder;

    public MemberDto insert(MemberDto dto) {
        if (dto == null) {
            throw new MyRequestException("input data error !");
        }
        dto.setPasswd(encoder.encode(dto.getPasswd()));
        this.mybatisMapper.insert(dto);
        return dto;
    }

    public List<MemberDto> findAll() {
        List<MemberDto> all = this.mybatisMapper.findAll();
        return all;
    }

    public MemberDto findById(Long id) {
        if (id == null) {
            throw new MyRequestException("delete id error !");
        }
        MemberDto find = this.mybatisMapper.findById(id);
        if (find == null) {
            throw new MyDataNotFoundException("data can't found !");
        }
        return find;
    }

    public MemberDto update(MemberDto dto) {
        if (dto == null || dto.getId() == null) {
            throw new MyRequestException("update data error !");
        }
        this.findById(dto.getId());
        this.mybatisMapper.update(dto);
        return dto;
    }

    public Boolean deleteById(Long id) {
        if (id == null) {
            throw new MyRequestException("delete id error !");
        }
        this.findById(id);
        this.mybatisMapper.deleteById(id);
        return true;
    }

    public Page<MemberDto> findByUserIdContainsAndNickNameContains(String userId, String nickName, String role, Pageable pageable) {
        if (pageable == null) {
            throw new MyRequestException("find pageable error !");
        }
        Long count = this.mybatisMapper.countByUserIdContainsAndNickNameContains(userId, nickName, role);
        List<MemberDto> list = this.mybatisMapper.findByUserIdContainsAndNickNameContains(userId, nickName, role, pageable);
        return new PageImpl<>(list, pageable, count);
    }

    public MemberDto findByUserId(String userId) {
        if (userId == null) {
            throw new MyRequestException("userId null error !");
        }
        MemberDto find = this.mybatisMapper.findByUserId(userId);
        if (find == null) {
            throw new MyDataNotFoundException("userId can't found !");
        }
        return find;
    }

    public void changePasswd(MemberDto dto) {
        if ( dto == null ) {
            throw new MyRequestException("dto null error !");
        }
        dto.setPasswd(encoder.encode(dto.getPasswd()));
        this.mybatisMapper.changePasswd(dto);
    }
}
