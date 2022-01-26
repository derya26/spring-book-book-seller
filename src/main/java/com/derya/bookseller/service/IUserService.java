package com.derya.bookseller.service;

import java.util.Optional;

import com.derya.bookseller.model.User;

public interface IUserService {

	User saveUser(User user);

	Optional<User> findByUsername(String uername);

	void makeAdmin(String username);

}
