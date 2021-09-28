package com.cg.movie.dao;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.movie.entities.Movie;
import com.cg.movie.entities.Theatre;

public interface IMovieDao extends JpaRepository<Movie, Integer>{

	Theatre save(@Valid Theatre theatre);

}
