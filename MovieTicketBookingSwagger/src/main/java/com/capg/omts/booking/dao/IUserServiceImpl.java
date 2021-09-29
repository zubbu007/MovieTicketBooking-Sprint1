package com.capg.omts.booking.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.omts.booking.model.Users;
import com.capg.omts.booking.repository.IUserRepository;


@Service(value="IUserService")

public class IUserServiceImpl implements IUserService{
	@Autowired
    IUserRepository repository;
	
	@Override
	
	public Users addNewUser(Users user) {
		return repository.save(user);
	}

	@Override
	public Users signIn(Users user) {
		//return repository.save(user);
		return null;
	}
	@Override
	public Users signOut(Users user) {
		//return repository.save(user);
		return null;
	}
	
}