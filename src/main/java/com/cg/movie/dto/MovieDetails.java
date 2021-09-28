package com.cg.movie.dto;

import java.sql.Date;
import java.util.Set;

import com.cg.movie.entities.Movie;

public class MovieDetails {
	private Integer id;
	private String movieName;
	private String movieDir;
	private Integer movieLength;
	private String langs;
	private Date releaseDate;
	public MovieDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieDetails(Integer id, String movieName, String movieDir, Integer movieLength, String langs,
			Date releaseDate) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieDir = movieDir;
		this.movieLength = movieLength;
		this.langs = langs;
		this.releaseDate = releaseDate;
	}
	public MovieDetails(Movie movie) {
		id=movie.getId();
		movieName=movie.getMovieName();
		movieDir=movie.getMovieName();
		movieLength=movie.getMovieLength();
		langs=movie.getLangs();
		releaseDate=movie.getReleaseDate();
	}
	@Override
	public String toString() {
		return "MovieDetails [id=" + id + ", movieName=" + movieName + ", movieDir=" + movieDir + ", movieLength="
				+ movieLength + ", langs=" + langs + ", releaseDate=" + releaseDate + "]";
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
	public String getMovieDir() {
		return movieDir;
	}
	public void setMovieDir(String movieDir) {
		this.movieDir = movieDir;
	}
	public Integer getMovieLength() {
		return movieLength;
	}
	public void setMovieLength(Integer movieLength) {
		this.movieLength = movieLength;
	}
	public String getLangs() {
		return langs;
	}
	public void setLangs(String langs) {
		this.langs = langs;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	

	
}
