package com.niit.babyimdb.repository;

import com.niit.babyimdb.domain.Movie;
import org.springframework.data.repository.CrudRepository;

public interface IMovieRepository extends CrudRepository<Movie, Integer> {
}
