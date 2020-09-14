package com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.dao;

import com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {

    User findByUsername(String name);
}
