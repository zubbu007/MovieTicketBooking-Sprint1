/**
 	* Project Name : OnlineMovieTicket 
 	*
 	* 
**/
package com.capg.omts.booking.service;


import java.util.List;

import com.capg.omts.booking.dto.SeatDetails;
import com.capg.omts.booking.model.Seat;
import com.capg.omts.booking.model.SeatReader;
import com.capg.omts.booking.model.Seatlist;


public interface Seatservice {
	
	
	  List<Seat> showAvailableSeats();
	
	  List<Seat> bookSeats(Seatlist seatIds);

		
	  List<Seat> blockSeats(Seatlist seatIds);

		
	  List<Seat> cancelSeats(Seatlist seatIds);

	  Seat addSeat(SeatReader seatReader);

	static List<SeatDetails> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}


