package com.capg.omts.booking.repository;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.omts.booking.model.Show;

@Repository(value="IShowRepository")
public interface IShowRepository extends JpaRepository<Show, Integer>{
	@Query("select s from show s join fetch s.theatre t where t.theatreId=:pdata")
	List<Show> findByTheatre(@Param("pdata")int theatreId);
	List<Show> findByShowStartTime(LocalDateTime date);
}
