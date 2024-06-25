package com.raju.BookService.service.impl;

import com.raju.BookService.entity.Book;
import com.raju.BookService.repository.IBookRepository;
import com.raju.BookService.service.IBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BookServiceImpl implements IBookService {
    private final IBookRepository iBookRepository;

    @Override
    public Book create(Book book) {
        return iBookRepository.save(book);
    }

    @Override
    public Book getOneBook(Long id) {
        return iBookRepository.findById(id).get();
    }

    @Override
    public List<Book> getAllBooks() {
        return iBookRepository.findAll();
    }
}
