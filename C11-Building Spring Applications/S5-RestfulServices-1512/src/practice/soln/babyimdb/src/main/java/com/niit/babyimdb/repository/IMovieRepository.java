package com.niit.babyimdb.repository;

import com.niit.babyimdb.domain.Movie;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IMovieRepository extends CrudRepository<Movie, Integer> {
}
