package com.cg.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.movie.dao.IMovieDao;
import com.cg.movie.entities.Movie;
import com.cg.movie.exception.MovieAlreadyExistsException;


@Service
@Transactional
public class MovieServiceImpl implements  IMovieService{
	@Autowired
	private IMovieDao dao;

	@Override
	public Movie registerMovie(Movie movie) throws Exception {
		boolean exist = movie.getId()!=null&& dao.existsById(movie.getId());
		if (exist) {
            throw new MovieAlreadyExistsException("Movie already exists for id=" + movie.getId());

		}
		movie=dao.save(movie);
		System.out.println("returning saved movie: "+movie);
		return movie;
	}

	@Override
	public List<Movie> findAll() {
		System.out.println(dao.getClass().getName());
		List<Movie> list = dao.findAll();
        return list;

	}

}
