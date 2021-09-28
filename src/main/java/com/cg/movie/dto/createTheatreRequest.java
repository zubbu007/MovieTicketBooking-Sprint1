package com.cg.movie.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.cg.movie.entities.Movie;

public class createTheatreRequest {
	@NotBlank
	@Size(min = 3 ,max = 20)
	private String theatreName;
	@NotBlank
	@Size(min = 3 ,max = 20)
	private String theatrecity;
	@NotBlank
	@Size(min = 3 ,max = 20)
	private String managerName;
	@NotBlank
	@Size(min = 3 ,max = 20)
	private String managerContact;
	
	private Set<Movie> movies ;

	@Override
	public String toString() {
		return "createTheatreRequest [theatreName=" + theatreName + ", theatrecity=" + theatrecity + ", managerName="
				+ managerName + ", managerContact=" + managerContact + ", movies=" + movies + "]";
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

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
	
}
