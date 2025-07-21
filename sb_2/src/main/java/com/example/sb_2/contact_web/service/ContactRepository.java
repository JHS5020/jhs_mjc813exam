//package com.example.sb_2.contact_web.service;
//
//import com.example.sb_2.contact_web.dto.Contact;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ContactRepository {
//    @Autowired
//    private IContactMybatisMapper mapper;
//
//    public Contact insert(Contact item){
//        this.mapper.insert(item);
//        return item;
//    }
//
//    public List<Contact> selectAll(){
//        return this.mapper.selectAll();
//    }
//    public Contact selectOne(Long id){
//        return this.mapper.selectOne(id);
//    }
//    public void update(Contact dto) {
//        this.mapper.update(dto);
//    }
//}
