package com.cg.movie.dto;

import java.util.Set;

public class MovieDetails {
	private Integer id;
	private String movieName;
	private String movieLang;
	private String movieActor;
	private String movieActress;
	private String movieDir;
	
	private Set<TheatreDetails> theatres;

	public MovieDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MovieDetails(Integer id, String movieName, String movieLang, String movieActor, String movieActress,
			String movieDir, Set<TheatreDetails> theatres) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieLang = movieLang;
		this.movieActor = movieActor;
		this.movieActress = movieActress;
		this.movieDir = movieDir;
		this.theatres = theatres;
	}

	public MovieDetails(Integer id, String movieName, String movieLang, String movieActor, String movieActress,
			String movieDir) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieLang = movieLang;
		this.movieActor = movieActor;
		this.movieActress = movieActress;
		this.movieDir = movieDir;
	}

	@Override
	public String toString() {
		return "MovieDetails [id=" + id + ", movieName=" + movieName + ", movieLang=" + movieLang + ", movieActor="
				+ movieActor + ", movieActress=" + movieActress + ", movieDir=" + movieDir + ", theatres=" + theatres
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getMovieActress() {
		return movieActress;
	}

	public void setMovieActress(String movieActress) {
		this.movieActress = movieActress;
	}

	public String getMovieDir() {
		return movieDir;
	}

	public void setMovieDir(String movieDir) {
		this.movieDir = movieDir;
	}

	public Set<TheatreDetails> getTheatres() {
		return theatres;
	}

	public void setTheatres(Set<TheatreDetails> theatres) {
		this.theatres = theatres;
	}
	

}
