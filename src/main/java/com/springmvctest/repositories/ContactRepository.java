package com.springmvctest.repositories;

import com.springmvctest.contacts.Contact;
import org.springframework.data.repository.PagingAndSortingRepository;

//support Spring Data JPA
public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {
}
