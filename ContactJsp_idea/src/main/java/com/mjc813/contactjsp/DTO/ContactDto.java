package com.mjc813.contactjsp.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDto implements IContact {
    public Integer id;
    public String name;
    public String phoneNumber;
    public String zipNumber;
    public String email;
    public String contactFullInfo;
}
