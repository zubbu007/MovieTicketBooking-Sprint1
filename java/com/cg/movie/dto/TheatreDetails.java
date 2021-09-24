package com.cg.movie.dto;

import java.util.Set;

import com.cg.movie.entities.Theatre;

public class TheatreDetails {
	private int id;
	private String theatreName;
	private String theatreLocation;
	
//	private Set<ShowDetails> shows;

	public TheatreDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TheatreDetails(int id, String theatreName, String theatreLocation) {
		super();
		this.id = id;
		this.theatreName = theatreName;
		this.theatreLocation = theatreLocation;
	}

	public TheatreDetails(Theatre theatre) {
		id=theatre.getId();
		theatreName=theatre.getTheatreName();
		theatreLocation=theatre.getTheatreLocation();
	}

	@Override
	public String toString() {
		return "TheatreDetails [id=" + id + ", theatreName=" + theatreName + ", theatreLocation=" + theatreLocation
				+ "]";
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
	
	
	

}
