package com.cg.movie.service;

import java.util.List;

import javax.validation.Valid;

import com.cg.movie.dto.MovieDetails;
import com.cg.movie.entities.Movie;
import com.cg.movie.entities.Theatre;
import com.cg.movie.exception.MovieNotFoundException;

public interface IMovieService {

	Theatre registerMovie(Theatre theatre) throws Exception;

//	List<Theatre> findAll();





}
