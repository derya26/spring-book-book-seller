package com.derya.bookseller.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.derya.bookseller.model.Role;
import com.derya.bookseller.model.User;

public interface IUserRepository  extends JpaRepository<User,Long>{  //ilk parametre model digeri id
	
	Optional<User> findByUsername(String username);
	
	
	@Modifying
	@Query("update User set role = :role where username = :username")
	void updateUserRole(@Param("username") String username, @Param("role")Role role);


	//void updateUserRole(String username, Role admin);

}
