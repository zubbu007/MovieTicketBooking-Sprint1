
package com.capg.omts.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.booking.model.Seat;
import com.capg.omts.booking.model.SeatReader;
import com.capg.omts.booking.model.Seatlist;
import com.capg.omts.booking.service.SeatServiceImp;


@RestController
@CrossOrigin("*")
@RequestMapping("/seat")
public class Seatcontroller {

	
	@Autowired
	SeatServiceImp seatService;
/**********************Add seat ***************************************************/
	@PostMapping("/add")
	public ResponseEntity<Seat> addSeat( @RequestBody SeatReader seatReader) {
		Seat seat=seatService.addSeat(seatReader);
		return new ResponseEntity<Seat>(seat, HttpStatus.CREATED);	
	}
/**********************Book seat *************************************************/
	@PutMapping("/book")
//	@HystrixCommand(fallbackMethod = "bookSeatfallback")
	public ResponseEntity<List<Seat>> bookSeat(@RequestBody Seatlist seatIds){

		return new ResponseEntity<List<Seat>>(seatService.bookSeats(seatIds), HttpStatus.OK);
	}
/**********************show available seat *************************************************/
	
	@GetMapping("/available")
	public ResponseEntity<List<Seat>> AvailableSeats(){
		List<Seat> seats = seatService.showAvailableSeats();
		return new ResponseEntity<List<Seat>>(seats, HttpStatus.OK);
	}

/********************** Block seat *************************************************/

	@PutMapping("/block")
	public ResponseEntity<List<Seat>> blockSeat(@RequestBody Seatlist seatIds){
		return new ResponseEntity<List<Seat>>(seatService.blockSeats(seatIds), HttpStatus.OK);
	}
/**********************cancel seat *************************************************/
	
	@PutMapping("/cancel")
	public ResponseEntity<List<Seat>> cancelSeat(@RequestBody Seatlist seatIds){
		return new ResponseEntity<List<Seat>>(seatService.cancelSeats(seatIds), HttpStatus.OK);
	}


}

