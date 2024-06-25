package com.raju.students.repo;

import com.raju.students.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student , Integer> {
   // Student FindStudentById(int id);
}
