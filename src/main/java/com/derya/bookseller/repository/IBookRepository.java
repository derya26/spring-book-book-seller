package com.derya.bookseller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.derya.bookseller.model.Book;



/**
 * @author Derya Ucar
 * @version
 * @since Jan 25, 2022
 *
 */
public interface IBookRepository  extends JpaRepository<Book, Long>{
	
	

}
