package com.capg.omts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.omts.booking.MmsBookingApplication;
import com.capg.omts.booking.model.Seat;
import com.capg.omts.booking.model.SeatReader;
import com.capg.omts.booking.service.Seatservice;
@SpringBootTest(classes = MmsBookingApplication.class)

class SeatControllerTest {
	@Autowired
	Seatservice seatService ;
	@Test
    public void Addseattest() {
    	SeatReader  seat =new SeatReader(123466,"AVAILABLE",1200);
    	Seat Seat=seatService.addSeat(seat);
    	assertNotNull(Seat);
    }
//	@Test
//    public void allseatstest() {
//      List<Seat> seatlist=seatService.showAvailableSeats();
//      assertNotNull(seatlist);
//
//	}
}
