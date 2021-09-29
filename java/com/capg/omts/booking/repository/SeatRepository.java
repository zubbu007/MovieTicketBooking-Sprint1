package com.capg.omts.booking.repository;
import java.util.*;

import org.hibernate.Session;
import org.springframework.data.annotation.Persistent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capg.omts.booking.model.Seat;
import com.capg.omts.booking.service.seatStatus;
@Repository
@Persistent
public interface SeatRepository extends JpaRepository<Seat, Integer> {
	@Query("from Seat where seatStatus=seatStatus")
	public List<Seat> showAvailableSeats(seatStatus seatStatus);

}
