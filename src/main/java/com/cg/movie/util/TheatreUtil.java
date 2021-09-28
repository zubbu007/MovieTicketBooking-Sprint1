package com.cg.movie.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.cg.movie.dto.MovieDetails;
import com.cg.movie.dto.TheatreDetails;
import com.cg.movie.entities.Movie;
import com.cg.movie.entities.Theatre;

@Component
public class TheatreUtil {

	public TheatreDetails toTheDetails(Theatre theatre) {
		Set<Movie> movies=theatre.getMovies();
		Set<MovieDetails> details=new HashSet<>();
		for (Movie movie: movies) {
			details.add(new MovieDetails(movie));
			
		}
		return new TheatreDetails(theatre.getId(),theatre.getTheatreName(),theatre.getTheatrecity(),theatre.getManagerName(),theatre.getManagerContact(),details);
	}

	public List<TheatreDetails> toTheDetails(List<Theatre> theatres) {
		List<TheatreDetails> theatreDetailList=new ArrayList<>();
		for (Theatre theatre : theatres) {
			TheatreDetails theatreDetail=toTheDetails(theatre);
			System.out.println(theatreDetail);
			theatreDetailList.add(theatreDetail);
			
		}
		return theatreDetailList;
	}

//	public static TheatreDetails toTheDetails(Movie movie) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
