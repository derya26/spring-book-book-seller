package com.derya.bookseller.service;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.derya.bookseller.model.Role;
import com.derya.bookseller.model.User;
import com.derya.bookseller.repository.IUserRepository;

/**
 * @author Derya Ucar
 * @version
 * @since Jan 25, 2022
 *
 */

@Service
public class UserService implements IUserService{
	
	@Autowired
	private IUserRepository userRepository; 
	
	@Autowired
	private PasswordEncoder passwordEncoder; 
	
	@Override
	public User saveUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setRole(Role.USER);
		user.setCreateTime(LocalDateTime.now());
		return userRepository.save(user);
	}
	
	@Override
	public Optional<User> findByUsername(String uername){
		return userRepository.findByUsername(uername);
	}
	
	@Override
	@Transactional //required when executing an update/delete query
	public void makeAdmin(String username) {
		userRepository.updateUserRole(username, Role.ADMIN);
	}

}
