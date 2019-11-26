package com.djamware.react.repositories;

import com.djamware.react.models.CustomerCreditCard;
import org.springframework.data.repository.CrudRepository;

public interface CustomerCreditCardRepository extends CrudRepository<CustomerCreditCard, String> {
    @Override
    void delete(CustomerCreditCard deleted);
}