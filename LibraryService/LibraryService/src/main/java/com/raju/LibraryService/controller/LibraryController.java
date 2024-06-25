package com.raju.LibraryService.controller;

import com.raju.LibraryService.entity.Book;
import com.raju.LibraryService.entity.Library;
import com.raju.LibraryService.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/library")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/save")
    public Library savelibrary(@RequestBody Library library){
        return libraryService.createLibrary(library);
    }

    @GetMapping("/{id}")
    public Library getOne(@PathVariable int id){
        Book book = restTemplate.getForObject("http://localhost:8182/api/book/"+id,Book.class);
        Library library = libraryService.getOne(id);
        library.setBook(book);
        return library;
    }
}
