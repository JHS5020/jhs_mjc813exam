package com.example.sb_2.contact_web.dto;

public interface IContact {
    Long getId();
    void setId(Long id);

    String getName();
    void setName(String name);

    String getPhoneNumber();
    void setPhoneNumber(String phoneNumber);

    String getZipNumber();
    void setZipNumber(String zipNumber);

    String getEmail();
    void setEmail(String email);

    default String getContactFullInfo(){
        return String.format("[ID:%d, 이름:%s, 전화번호:%s, ZIP:%s, Email:%s]"
                , this.getId()
                , this.getName()
                , this.getPhoneNumber()
                , this.getZipNumber()
                , this.getEmail()
        );
    }

}
