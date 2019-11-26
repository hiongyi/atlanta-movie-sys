package com.djamware.react.controllers;

import com.djamware.react.models.CustomerCreditCard;
import com.djamware.react.repositories.CustomerCreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
public class CustomerCreditCardController {

    @Autowired
    CustomerCreditCardRepository customerCreditCardRepository;

    @RequestMapping(method=RequestMethod.GET, value="/creditCards")
    public Iterable<CustomerCreditCard> customerCreditCard() {
        return customerCreditCardRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/creditCards")
    public CustomerCreditCard save(@RequestBody CustomerCreditCard contact) {
        customerCreditCardRepository.save(contact);

        return contact;
    }

    @RequestMapping(method=RequestMethod.GET, value="/creditCards/{id}")
    public Optional<CustomerCreditCard> show(@PathVariable String id) {
        return customerCreditCardRepository.findById(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/creditCards/{id}")
    public CustomerCreditCard update(@PathVariable String id, @RequestBody CustomerCreditCard contact) {
        Optional<CustomerCreditCard> optcontact = customerCreditCardRepository.findById(id);
        CustomerCreditCard c = optcontact.get();
        if(contact.getCreditCardNum() != null)
            c.setCreditCardNum(contact.getCreditCardNum());
        if(contact.getUsername() != null)
            c.setUsername(contact.getUsername());

        customerCreditCardRepository.save(c);
        return c;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/creditCards/{id}")
    public String delete(@PathVariable String id) {
        Optional<CustomerCreditCard> optcontact = customerCreditCardRepository.findById(id);
        CustomerCreditCard contact = optcontact.get();
        customerCreditCardRepository.delete(contact);

        return "";
    }
}