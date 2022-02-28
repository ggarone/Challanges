package com.garone.gestionaleDB.service;

import java.util.List;
import java.util.Map;

import com.garone.gestionaleDB.entities.Persona;
import com.garone.gestionaleDB.entities.User;

public interface UserService {
	void addUser(User u);
	void updateUser(User u);
	void deleteUser(int id);
	
	User getUserById(int id);
	List<User> getPersone();
	Map<Integer, User> getUserMap();
	boolean isAuthTrue(String username, String password);
}
