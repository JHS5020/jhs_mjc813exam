package com.example.sb_2.contact_web;

import com.example.sb_2.contact_web.service.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;

}
