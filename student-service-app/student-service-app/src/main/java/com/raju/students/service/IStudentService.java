package com.raju.students.service;

import com.raju.students.entity.Student;
import com.raju.students.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

public interface IStudentService {
    public Student getStudentById(int id);

    Student createStudent(Student student);
}
