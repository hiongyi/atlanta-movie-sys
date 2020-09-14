package com.cs4400.AtlantaMovieSys.AtlantaMovieSys04;

import com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.dao.UserDao;
import com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class AtlantaMovieSys04Application {

	public static void main(String[] args) {
		SpringApplication.run(AtlantaMovieSys04Application.class, args);
	}

//	@Bean
//	public CommandLineRunner init(UserDao userDao){
//		return args -> {
//			User user1 = new User();
//			user1.setFirstName("Devglan");
//			user1.setLastName("Devglan");
//			user1.setUsername("devglan");
//			user1.setPassword("devglan");
//			userDao.save(user1);
//
//			User user2 = new User();
//			user2.setFirstName("John");
//			user2.setLastName("Doe");
//			user2.setUsername("john");
//			user2.setPassword("john");
//			userDao.save(user2);
//		};
//	}

}
