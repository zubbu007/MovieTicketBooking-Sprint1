package com.cg.movie.controller;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movie.dto.MovieDetails;
import com.cg.movie.dto.TheatreDetails;

import com.cg.movie.dto.createTheatreRequest;
import com.cg.movie.entities.Movie;
import com.cg.movie.entities.Theatre;
import com.cg.movie.exception.MovieNotFoundException;
import com.cg.movie.service.IMovieService;
import com.cg.movie.util.TheatreUtil;


@RestController
@RequestMapping("/ADMIN")
@Validated
public class MovieController {
	@Autowired
	private IMovieService movieService;
	
	@Autowired
	private TheatreUtil theatreUtil;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/addMovies")
	public TheatreDetails add(@RequestBody @Valid createTheatreRequest mReqData) throws Exception {
		System.out.println("request data : "+mReqData);
		Theatre theatre=new Theatre(mReqData.getTheatreName(),mReqData.getTheatrecity(),mReqData.getManagerName(),mReqData.getManagerContact());
	    Set<Movie> movieSet=mReqData.getMovies();
	    if (movieSet!=null) {
			for(Movie movie:movieSet) {
				theatre.addMovie(movie);
			}
		}
	    System.out.println("movie came: "+ theatre);
	    theatre=movieService.registerMovie(theatre);
	    TheatreDetails theDetails=theatreUtil.toTheDetails(theatre);
		
		return theDetails;	
	}
//	@GetMapping("/viewAll")
//	public List<TheatreDetails> fetchAll(){
//		List<Theatre> theatres=movieService.findAll();
////		System.out.println(movies);
//		List<TheatreDetails> response=theatreUtil.toTheDetails(theatres);
//		return response;
//	}
	
//	@DeleteMapping("/delete/{id}")
//	public TheatreDetails deleteMovie(@PathVariable("id") Integer id) throws MovieNotFoundException{
//		Movie movie = movieService.deleteMovie(id);
//		TheatreDetails movDetails = TheatreUtil.toTheDetails(movie);
//		return movDetails;
//		
//	}
//	@PutMapping("/update")
//	public Movie updateMovie(@RequestBody  @Valid  createMovieUpdate movUpdate) throws MovieNotFoundException{
//		return  this.movieService.updateMovie(movUpdate);
//		 
//	}
}
