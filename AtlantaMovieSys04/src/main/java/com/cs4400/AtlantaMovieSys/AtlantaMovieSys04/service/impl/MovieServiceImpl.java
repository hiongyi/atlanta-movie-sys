//package com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.service.impl;
//
//
//import com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.dao.MovieDao;
//import com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.model.Dto.MovieDto;
//import com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.model.Movie;
//import com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.service.MovieService;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Transactional
//@Service(value = "movieService")
//public class MovieServiceImpl implements MovieService {
//
//    @Autowired
//    private MovieDao movieDao;
//
//    public List<Movie> findAll() {
//        List<Movie> list = new ArrayList<>();
//        movieDao.findAll().iterator().forEachRemaining(list::add);
//        return list;
//    }
//
//    @Override
//    public void delete(int id) {
//        movieDao.deleteById(id);
//    }
//
//    @Override
//    public Movie findOne(String Name) {
//        return movieDao.findByName(Name);
//    }
//
//    @Override
//    public Movie findById(int id) {
//        Optional<Movie> optionalMovie = movieDao.findById(id);
//        return optionalMovie.isPresent() ? optionalMovie.get() : null;
//    }
//
//    @Override
//    public MovieDto update(MovieDto movieDto) {
//        Movie movie = findById(movieDto.getId());
////        if(movie != null) {
////            BeanUtils.copyProperties(movieDto, movie, "password", "username");
////            movieDao.save(movie);
////        }
//        return movieDto;
//    }
//
//    @Override
//    public Movie save(MovieDto movie) {
//        Movie newmovie = new Movie();
//        newmovie.setName(movie.getName());
//        newmovie.setReleaseDate(movie.getReleaseDate());
//        newmovie.setDuration(movie.getDuration());
//
//        return movieDao.save(newmovie);
//    }
//}