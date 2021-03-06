package com.capg.omts.booking.repository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.omts.booking.model.Movie;

@Repository(value="IMovieRepository")
public interface IMovieRepository extends JpaRepository<Movie, Integer>   {
	@Query("select m from movie m join fetch m.theatre t where t.theatreId=:pdata")
	List<Movie> findByTheatre(@Param("pdata")int theaterid);
	@Query("select m from movie m join fetch m.show s where s.showStartTime=:pdate")
	List<Movie> findByDate(@Param("pdate")LocalDateTime date);

}
