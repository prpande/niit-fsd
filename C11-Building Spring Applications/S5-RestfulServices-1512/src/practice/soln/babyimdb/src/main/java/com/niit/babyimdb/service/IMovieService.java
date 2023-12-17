package com.niit.babyimdb.service;

import com.niit.babyimdb.domain.Movie;

import java.util.List;

public interface IMovieService {
    Movie saveMovie(Movie movie);
    List<Movie> getAllMovies();
}
