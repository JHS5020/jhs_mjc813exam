package com.example.sb_2.contact_web.service;

import com.example.sb_2.contact_web.dto.Contact;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapping
public interface IContactMybatisMapper {
    public void insert();
    public List<Contact> selectAll();
    public Contact selectOne(Long id);
    public Contact update(Contact dto);
}
