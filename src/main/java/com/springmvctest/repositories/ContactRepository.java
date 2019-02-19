package com.springmvctest.repositories;

import com.springmvctest.contacts.Contact;
import org.springframework.data.repository.CrudRepository;

//support Spring Data JPA
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
