package com.springmvctest;

import com.springmvctest.Contact;

import java.util.List;

//службы, которые должны быть отображены
public interface ContactService {
    List<Contact> findAll();

    Contact findById(Long id);

    Contact save(Contact contact);
}
