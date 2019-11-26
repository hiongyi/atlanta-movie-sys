package com.djamware.react.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "creditCards")
public class CustomerCreditCard {
    @Id
    String id;

    String creditCardNum;
    String username;


    public CustomerCreditCard() {
    }

    public CustomerCreditCard(String creditCardNum, String username ) {
        this.creditCardNum = creditCardNum;
        this.username = username;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(String creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}