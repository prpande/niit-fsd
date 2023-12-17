package com.niit.babyimdb.service;

import com.niit.babyimdb.domain.Movie;
import com.niit.babyimdb.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements IMovieService{

    private IMovieRepository movieRepository;

    @Autowired
    MovieServiceImpl(IMovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return (List<Movie>) movieRepository.findAll();
    }
}
