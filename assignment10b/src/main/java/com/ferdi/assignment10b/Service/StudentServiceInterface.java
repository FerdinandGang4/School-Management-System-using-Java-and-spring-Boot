package com.ferdi.assignment10b.Service;

import com.ferdi.assignment10b.Domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentServiceInterface {
    public Student  createStudent(Student student);


    public List<Student> getAllStudents();


    public Optional<Student> getStudentById(Long id);
}
