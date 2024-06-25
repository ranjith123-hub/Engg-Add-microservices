package com.raju.BookService.controller;

import com.raju.BookService.entity.Book;
import com.raju.BookService.service.IBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("api/book")
@RequiredArgsConstructor
public class BookController {
    private final IBookService bookService;

    // create

    @PostMapping("/save")
    public Book createBook(@RequestBody Book book){
      return   bookService.create(book);
    }
    // get single book
    @GetMapping("{id}")

    public Book getOne(@PathVariable Long id){
        return bookService.getOneBook(id);
    }

    // get all

    public List<Book> getAll(){
        return bookService.getAllBooks();
    }
}
