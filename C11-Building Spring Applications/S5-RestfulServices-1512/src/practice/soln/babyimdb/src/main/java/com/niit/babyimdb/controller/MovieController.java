package com.niit.babyimdb.controller;

import com.niit.babyimdb.domain.Movie;
import com.niit.babyimdb.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MovieController {
    private IMovieService movieService;

    @Autowired
    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity getAllMovies() {
        return new ResponseEntity(movieService.getAllMovies(), HttpStatus.OK);
    }

    @PostMapping("/movie")
    public ResponseEntity saveMovie(@RequestBody Movie movie) {
        return new ResponseEntity(movieService.saveMovie(movie), HttpStatus.CREATED);
    }
}
