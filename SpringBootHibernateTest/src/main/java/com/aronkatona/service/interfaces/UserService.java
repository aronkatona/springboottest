package com.aronkatona.service.interfaces;

import java.util.List;

import com.aronkatona.domain.User;


public interface UserService {

	public void saveUser();
	
	public void saveLotOfUsers(long numberOfUsers);

	public List<User> getAllUser();
}
