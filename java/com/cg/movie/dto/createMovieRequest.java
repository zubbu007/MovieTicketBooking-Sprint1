package com.cg.movie.dto;

import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.cg.movie.entities.Theatre;

public class createMovieRequest {
	@NotBlank
	@Size(min = 2,max = 20)
	private String movieName;
	@NotBlank
	@Size(min = 2,max = 20)
	private String movieLang;
	@NotBlank
	@Size(min = 2,max = 20)
	private String movieActor;
	@NotBlank
	@Size(min = 2,max = 20)
	private String movieActress;
	@NotBlank
	@Size(min = 2,max = 20)
	private String movieDir;
	
	private Set<Theatre> theatres;

	@Override
	public String toString() {
		return "createMovieRequest [movieName=" + movieName + ", movieLang=" + movieLang + ", movieActor=" + movieActor
				+ ", movieActress=" + movieActress + ", movieDir=" + movieDir + ", theatres=" + theatres + "]";
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieLang() {
		return movieLang;
	}

	public void setMovieLang(String movieLang) {
		this.movieLang = movieLang;
	}

	public String getMovieActor() {
		return movieActor;
	}

	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}

	public String getMovieDir() {
		return movieDir;
	}

	public void setMovieDir(String movieDir) {
		this.movieDir = movieDir;
	}

	public Set<Theatre> getTheatres() {
		return theatres;
	}

	public void setTheatres(Set<Theatre> theatres) {
		this.theatres = theatres;
	}

	public String getMovieActress() {
		return movieActress;
	}

	public void setMovieActress(String movieActress) {
		this.movieActress = movieActress;
	}
	
	


	

}
