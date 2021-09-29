package com.capg.omts.booking.dao;

import com.capg.omts.booking.model.Users;

public interface IUserService {
	public abstract Users addNewUser(Users user);
	public abstract Users signIn(Users user);
	public abstract Users signOut(Users user);

}