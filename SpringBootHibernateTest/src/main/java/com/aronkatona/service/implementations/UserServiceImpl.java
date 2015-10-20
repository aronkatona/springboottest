package com.aronkatona.service.implementations;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aronkatona.dao.interfaces.UserDAO;
import com.aronkatona.domain.User;
import com.aronkatona.service.interfaces.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public void saveUser() {
		String asd = UUID.randomUUID().toString();
		User user = new User(asd);
		userDAO.saveUser(user);
	}

	@Override
	public void saveLotOfUsers(long numberOfUsers) {

		String asd;
		User user;
		for (long i = 0; i < numberOfUsers; ++i) {
			asd = UUID.randomUUID().toString();
			user = new User(asd);
			userDAO.saveUser(user);
		}

	}

	@Override
	public List<User> getAllUser() {
		return userDAO.getAllUser();
	}

}
