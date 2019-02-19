package com.springmvctest.contactService;

import com.springmvctest.contacts.Contact;

import java.util.List;

//службы, которые должны быть отображены
public interface ContactService {
    List<Contact> findAll();

    Contact findById(Long id);

    Contact save(Contact contact);
}
