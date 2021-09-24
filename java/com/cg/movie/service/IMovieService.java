package com.cg.movie.service;

import java.util.List;

import com.cg.movie.entities.Movie;

public interface IMovieService {

	Movie registerMovie(Movie movie) throws Exception;

	List<Movie> findAll();

}
