package com.raju.LibraryService.service;

import com.raju.LibraryService.entity.Library;
import com.raju.LibraryService.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepository libraryRepository;

    public Library createLibrary(Library library){
        return libraryRepository.save(library);
    }

    public Library getOne(int id){
        return libraryRepository.findById(id).get();
    }
}
