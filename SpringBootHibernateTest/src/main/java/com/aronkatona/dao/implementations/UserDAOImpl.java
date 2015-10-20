package com.aronkatona.dao.implementations;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aronkatona.dao.interfaces.UserDAO;
import com.aronkatona.domain.User;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	private EntityManager em;

	@Override
	public void saveUser(User user) {
		em.persist(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUser() {
		return em.createQuery("SELECT u FROM User u").getResultList();
	}
	
}
