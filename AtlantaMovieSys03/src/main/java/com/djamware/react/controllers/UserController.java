package com.djamware.react.controllers;

import com.djamware.react.models.User;
import com.djamware.react.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(method=RequestMethod.GET, value="/users")
    public Iterable<User> user() {
        return userRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/users")
    public User save(@RequestBody User user) {
        userRepository.save(user);

        return user;
    }

    @RequestMapping(method=RequestMethod.GET, value="/users/{id}")
    public Optional<User> show(@PathVariable String id) {
        return userRepository.findById(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/users/{id}")
    public User update(@PathVariable String id, @RequestBody User user) {
        Optional<User> optuser = userRepository.findById(id);
        User u = optuser.get();

        if(user.getFirstName() != null)
            u.setFirstName(user.getFirstName());
        if(user.getLastName() != null)
            u.setLastName(user.getLastName());
        if(user.getUserName() != null)
            u.setUserName(user.getUserName());
        if(user.getPassWord() != null)
            u.setPassWord(user.getPassWord());
        if(user.getStatus() != null)
            u.setStatus(user.getStatus());

//        if(user.getAddress() != null)
//            u.setAddress(user.getAddress());
//        if(user.getCity() != null)
//            u.setCity(user.getCity());
//        if(user.getPhone() != null)
//            u.setPhone(user.getPhone());
//        if(user.getEmail() != null)
//            u.setEmail(user.getEmail());

        userRepository.save(u);
        return u;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/users/{id}")
    public String delete(@PathVariable String id) {
        Optional<User> optuser = userRepository.findById(id);
        User user = optuser.get();
        userRepository.delete(user);

        return "";
    }
}