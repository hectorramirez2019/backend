package com.youtube.demo.service;

import java.util.List;

import com.youtube.demo.model.User;

public interface UserService {

	/*
	 * guardar un usuario
	 * el usuario guradado
	 */
	User save(User user);

	/*
	 * crea una lista de usuarios
	 * lista de usuarios
	 * 
	 */
	List<User> findAll();

	/*
	 * borrar un usuario
	 * 
	 */
	void deleteUser(Long id);

}
