package com.cg.movie.dto;

import java.util.Set;

import com.cg.movie.entities.Theatre;

public class TheatreDetails {
    private int id;
	private String theatreName;
	private String theatrecity;
	private String managerName;
	private String managerContact;

	private Set<MovieDetails> movies;

	public TheatreDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TheatreDetails(int id, String theatreName, String theatrecity, String managerName, String managerContact) {
		super();
		this.id = id;
		this.theatreName = theatreName;
		this.theatrecity = theatrecity;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}

	public TheatreDetails(int id, String theatreName, String theatrecity, String managerName, String managerContact,
			Set<MovieDetails> movies) {
		super();
		this.id = id;
		this.theatreName = theatreName;
		this.theatrecity = theatrecity;
		this.managerName = managerName;
		this.managerContact = managerContact;
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "TheatreDetails [id=" + id + ", theatreName=" + theatreName + ", theatrecity=" + theatrecity
				+ ", managerName=" + managerName + ", managerContact=" + managerContact + ", movies=" + movies + "]";
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

	public String getTheatrecity() {
		return theatrecity;
	}

	public void setTheatrecity(String theatrecity) {
		this.theatrecity = theatrecity;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}

	public Set<MovieDetails> getMovies() {
		return movies;
	}

	public void setMovies(Set<MovieDetails> movies) {
		this.movies = movies;
	}
	

	
}
