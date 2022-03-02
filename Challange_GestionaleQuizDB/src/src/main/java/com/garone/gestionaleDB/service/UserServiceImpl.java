package com.garone.gestionaleDB.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garone.gestionaleDB.dal.PersonaDAO;
import com.garone.gestionaleDB.dal.UserDAO;
import com.garone.gestionaleDB.entities.Domanda;
import com.garone.gestionaleDB.entities.Persona;
import com.garone.gestionaleDB.entities.Test;
import com.garone.gestionaleDB.entities.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO repo;
	
	private Map<Integer,User> userMap;

	@Override
	public boolean isAuthTrue(String username, String password) {
		for(User user : repo.findAll()) {
			if(username.equals(user.getUsername()) && password.equals(user.getPassword())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void addUser(User u) {
		repo.save(u);
	}

	@Override
	public void updateUser(User u) {
		repo.save(u);
	}

	@Override
	public void deleteUser(int id) {
		repo.deleteById(id);
	}

	@Override
	public User getUserById(int id) {
		if(repo.findById(id).isPresent())
			return repo.findById(id).get();
		else
			return new User();
	}

	@Override
	public List<User> getPersone() {
		return repo.findAll();
	}

	@Override
	public Map<Integer, User> getUserMap() {
		if(userMap == null) {
			this.userMap = new TreeMap<Integer, User>();
			this.userMap = repo.findAll().stream()
					.collect(Collectors.toMap(
							User::getIdUser,
							Function.identity()));
			return userMap; 				
		}
		return this.userMap;
	}
}
