//package com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.dao;
//
//import com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.model.Movie;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface MovieDao extends CrudRepository<Movie, Integer> {
//
//    @Query("select m from Movie m where m.name = ?1")
//    Movie findByName(String name);
//}
