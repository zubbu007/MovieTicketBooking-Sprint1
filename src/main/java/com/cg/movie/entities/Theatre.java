package com.cg.movie.entities;

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

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "thea")
public class Theatre {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="theatreName")
	private String theatreName;
	@Column(name="theatrecity")
	private String theatrecity;
	@Column(name="managerName")
	private String managerName;
	@Column(name="managerContact")
	private String managerContact;
	@OneToMany(mappedBy="theatre",cascade=CascadeType.ALL)
	private Set<Movie> movies =new HashSet<>();
	public Theatre(Integer id, String theatreName, String theatrecity, String managerName, String managerContact,
			Set<Movie> movies) {
		super();
		this.id = id;
		this.theatreName = theatreName;
		this.theatrecity = theatrecity;
		this.managerName = managerName;
		this.managerContact = managerContact;
		this.movies = movies;
	}
	public Theatre() {
//		super();
		// TODO Auto-generated constructor stub
	}
	public Theatre(String theatreName, String theatrecity, String managerName, String managerContact) {
		super();
		this.theatreName = theatreName;
		this.theatrecity = theatrecity;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}
	public Theatre(Integer id, String theatreName, String theatrecity, String managerName, String managerContact) {
		super();
		this.id = id;
		this.theatreName = theatreName;
		this.theatrecity = theatrecity;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}
	@Override
	public String toString() {
		return "Theatre [id=" + id + ", theatreName=" + theatreName + ", theatrecity=" + theatrecity + ", managerName="
				+ managerName + ", managerContact=" + managerContact + ", movies=" + movies + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Set<Movie> getMovies() {
		return movies;
	}
	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
	public void addMovie(Movie movie) {
		movie.setTheatre(this);
		movies.add(movie);
	}
	
	
	
	
	
	
}