package com.capg.omts.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.omts.booking.model.Theatre;


@Repository(value="ITheatreRepository")
public interface ITheatreRepository extends JpaRepository<Theatre, Integer> {

}
