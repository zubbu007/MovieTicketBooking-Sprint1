package com.capg.omts.booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.omts.booking.service.UserDetails;

public interface ILoginDao extends JpaRepository<UserDetails, String> {

}
