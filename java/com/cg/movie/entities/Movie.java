package com.cg.movie.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cg.movie.dto.TheatreDetails;

@Entity
@Table(name = "mov")
public class Movie {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "movieName")
	private String movieName;
	@Column(name = "movieLang")
	private String movieLang;
	@Column(name = "movieActor")
	private String movieActor;
	@Column(name = "movieActress")
	private String movieActress;
	@Column(name = "movieDir")
	private String movieDir;
	@OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
	private Set<Theatre> theatres= new HashSet<>();
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(Integer id, String movieName, String movieLang, String movieActor, String movieActress,
			String movieDir, Set<Theatre> theatres) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieLang = movieLang;
		this.movieActor = movieActor;
		this.movieActress = movieActress;
		this.movieDir = movieDir;
		this.theatres = theatres;
	}
	public Movie(Integer id, String movieName, String movieLang, String movieActor, String movieActress,
			String movieDir) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieLang = movieLang;
		this.movieActor = movieActor;
		this.movieActress = movieActress;
		this.movieDir = movieDir;
	}
	public Movie(String movieName, String movieLang, String movieActor, String movieActress, String movieDir) {
		super();
		this.movieName = movieName;
		this.movieLang = movieLang;
		this.movieActor = movieActor;
		this.movieActress = movieActress;
		this.movieDir = movieDir;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", movieLang=" + movieLang + ", movieActor="
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
	public Set<Theatre> getTheatres() {
		return theatres;
	}
	public void setTheatres(Set<Theatre> theatres) {
		this.theatres = theatres;
	}
	public void addTheatre(Theatre theatre) {
		theatre.setMovie(this);
		theatres.add(theatre);
		
	}
	
	


}
