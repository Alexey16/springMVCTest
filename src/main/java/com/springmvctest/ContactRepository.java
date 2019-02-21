package com.springmvctest;

import org.springframework.data.repository.CrudRepository;

//support Spring Data JPA
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
