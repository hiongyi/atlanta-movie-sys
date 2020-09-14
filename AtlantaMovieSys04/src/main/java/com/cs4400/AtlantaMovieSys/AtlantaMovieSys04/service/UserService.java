package com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.service;



import com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.model.User;
import com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.model.Dto.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}