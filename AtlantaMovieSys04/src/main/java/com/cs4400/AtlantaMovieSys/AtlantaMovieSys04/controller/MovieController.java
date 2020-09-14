//package com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.controller;
//
//import com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.model.ApiResponse;
//import com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.model.Dto.MovieDto;
//import com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.model.Movie;
//import com.cs4400.AtlantaMovieSys.AtlantaMovieSys04.service.MovieService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@CrossOrigin(origins = "*", maxAge = 3600)
//@RestController
//@RequestMapping("/movie")
//public class MovieController {
//
//    @Autowired
//    private MovieService movieService;
//
//    @PostMapping
//    public ApiResponse<Movie> saveUser(@RequestBody MovieDto movie){
//        return new ApiResponse<>(HttpStatus.OK.value(), "Movie saved successfully.",movieService.save(movie));
//    }
//
//    @GetMapping
//    public ApiResponse<List<Movie>> listUser(){
//        return new ApiResponse<>(HttpStatus.OK.value(), "Movie list fetched successfully.",movieService.findAll());
//    }
//
//    @GetMapping("/{id}")
//    public ApiResponse<Movie> getOne(@PathVariable int id){
//        return new ApiResponse<>(HttpStatus.OK.value(), "Movie fetched successfully.",movieService.findById(id));
//    }
//
//    @PutMapping("/{id}")
//    public ApiResponse<MovieDto> update(@RequestBody MovieDto movieDto) {
//        return new ApiResponse<>(HttpStatus.OK.value(), "Movie updated successfully.",movieService.update(movieDto));
//    }
//
//    @DeleteMapping("/{id}")
//    public ApiResponse<Void> delete(@PathVariable int id) {
//        movieService.delete(id);
//        return new ApiResponse<>(HttpStatus.OK.value(), "Movie deleted successfully.", null);
//    }
//
//
//
//}