package com.raju.BookService.service;

import com.raju.BookService.entity.Book;

import java.util.List;

public interface IBookService {

    Book create(Book book);

    Book getOneBook(Long id);

    List<Book> getAllBooks();
}
