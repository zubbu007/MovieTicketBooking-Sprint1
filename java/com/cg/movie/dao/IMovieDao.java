package com.cg.movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.movie.entities.Movie;

public interface IMovieDao extends JpaRepository<Movie, Integer>{

}
