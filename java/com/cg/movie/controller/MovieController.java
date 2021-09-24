package com.cg.movie.controller;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movie.dto.MovieDetails;
import com.cg.movie.dto.TheatreDetails;
import com.cg.movie.dto.createMovieRequest;
import com.cg.movie.entities.Movie;
import com.cg.movie.entities.Theatre;
import com.cg.movie.service.IMovieService;
import com.cg.movie.util.MovieUtil;


@RestController
@RequestMapping("/ADMIN")
@Validated
public class MovieController {
	@Autowired
	private IMovieService movieService;
	
	@Autowired
	private MovieUtil movieUtil;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/addMovies")
	public MovieDetails add(@RequestBody @Valid createMovieRequest mReqData) throws Exception {
		System.out.println("request data : "+mReqData);
		Movie movie=new Movie(mReqData.getMovieName(),mReqData.getMovieLang(),mReqData.getMovieActor(),mReqData.getMovieActress(),mReqData.getMovieDir());
	    Set<Theatre> theaSet=mReqData.getTheatres();
	    if (theaSet!=null) {
			for(Theatre theatre:theaSet) {
				movie.addTheatre(theatre);
			}
		}
	    System.out.println("movie came: "+ movie);
	    movie=movieService.registerMovie(movie);
	    MovieDetails movDetails=movieUtil.toMovDetails(movie);
		
		return movDetails;
		
		
	}
	@GetMapping
	public List<MovieDetails> fetchAll(){
		List<Movie> movies = movieService.findAll();
		List<MovieDetails> response = movieUtil.toMovDetails(movies);
		return response;
		
	}
	
	

}
