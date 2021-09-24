package com.cg.movie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "theatre")
public class Theatre {
	@Id
	@GeneratedValue
	private int id;
	private String theatreName;
	private String theatreLocation;
	@ManyToOne
	@JoinColumn(name = "mov_id")
	private Movie movie;
	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Theatre(int id, String theatreName, String theatreLocation) {
		super();
		this.id = id;
		this.theatreName = theatreName;
		this.theatreLocation = theatreLocation;
	}
	@Override
	public String toString() {
		return "Theatre [id=" + id + ", theatreName=" + theatreName + ", theatreLocation=" + theatreLocation + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTheatreLocation() {
		return theatreLocation;
	}
	public void setTheatreLocation(String theatreLocation) {
		this.theatreLocation = theatreLocation;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

}
