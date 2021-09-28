package com.cg.movie.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mov")
public class Movie {
	@Id
	@GeneratedValue
	private Integer id;
	private String movieName;
	private String movieDir;
	private Integer movieLength;
	private String langs;
	private Date releaseDate;
	@ManyToOne
	@JoinColumn(name="theatreid")
	private Theatre theatre;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(Integer id, String movieName, String movieDir, Integer movieLength, String langs, Date releaseDate) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieDir = movieDir;
		this.movieLength = movieLength;
		this.langs = langs;
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", movieDir=" + movieDir + ", movieLength="
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

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	
}
	
	

	
