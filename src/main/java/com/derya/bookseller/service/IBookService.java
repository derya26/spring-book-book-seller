package com.derya.bookseller.service;

import java.util.List;

import com.derya.bookseller.model.Book;

public interface IBookService {

	Book saveBook(Book book);

	void deleteBook(Long id);

	List<Book> findAllBooks();

}
