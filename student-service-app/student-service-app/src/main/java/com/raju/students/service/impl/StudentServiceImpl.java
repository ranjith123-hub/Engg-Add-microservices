package com.raju.students.service.impl;

import com.raju.students.entity.Student;
import com.raju.students.repo.IStudentRepo;
import com.raju.students.service.IStudentService;
import org.hibernate.boot.model.source.spi.IdentifierSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentRepo repo;

    @Override
    public Student getStudentById(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public Student createStudent(Student student) {
        return repo.save(student);
    }
}
