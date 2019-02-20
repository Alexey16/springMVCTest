package com.springmvctest.contactController;

import com.springmvctest.contactService.ContactService;
import com.springmvctest.contacts.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/contacts")
public class ContactController {
    private final Logger LOG = LoggerFactory.getLogger(ContactController.class);
    private ContactService contactService;

    @Autowired
    public void setContactService(@Qualifier("com/springmvctest/contactService") ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public String list(Model model) {
        LOG.info("Logger contacts");
        List<Contact> contacts = contactService.findAll();
        model.addAttribute("contacts", contacts);
        LOG.info("No. of contacts" + contacts.size());
        return "contacts/list";
    }
}