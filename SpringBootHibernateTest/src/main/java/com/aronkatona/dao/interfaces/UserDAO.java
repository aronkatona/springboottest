package com.aronkatona.dao.interfaces;

import java.util.List;

import com.aronkatona.domain.User;

public interface UserDAO {

	public void saveUser(User user);

	public List<User> getAllUser();
}
