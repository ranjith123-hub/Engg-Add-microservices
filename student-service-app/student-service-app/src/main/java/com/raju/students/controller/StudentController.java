package com.raju.students.controller;

import com.raju.students.entity.Student;
import com.raju.students.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.getStudentById(id);
    }
    // create student
    @PostMapping("/save")
    public Student getStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
}
