package com.cg.movie.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.cg.movie.dto.MovieDetails;
import com.cg.movie.dto.TheatreDetails;
import com.cg.movie.entities.Movie;
import com.cg.movie.entities.Theatre;

@Component
public class MovieUtil {

	public MovieDetails toMovDetails(Movie movie) {
		Set<Theatre> theatres=movie.getTheatres();
		Set<TheatreDetails> details=new HashSet<>();
		for (Theatre theatre: theatres) {
			details.add(new TheatreDetails(theatre));
			
		}
		return new MovieDetails(movie.getId(),movie.getMovieName(),movie.getMovieLang(),movie.getMovieActor(),movie.getMovieActress(),movie.getMovieDir());
	}

	public List<MovieDetails> toMovDetails(Collection<Movie> movies) {
		List<MovieDetails> detailList = new ArrayList<>();
		for(Movie movie : movies) {
			MovieDetails details = toMovDetails(movie);
			System.out.println(details);
			detailList.add(details);
		}
		return detailList;
	}

	

}
