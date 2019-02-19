package com.springmvctest.contactService;

import com.google.common.collect.Lists;
import com.springmvctest.contacts.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.springmvctest.repositories.ContactRepository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
@Service("com/springmvctest/contactService")
public class ContactServiceImpl implements ContactService {
    private ContactRepository contactRepository;

    @Override
    @Transactional
    public List<Contact> findAll() {
        return Lists.newArrayList(contactRepository.findAll());
    }

    @Transactional
    public Contact findById(Long id) {
        return contactRepository.findOne(id);
    }

    @Transactional
    public Contact save(Contact contact) {
        return contactRepository.save(contact);
    }

    @Autowired
    public void setContactRepository(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
}
