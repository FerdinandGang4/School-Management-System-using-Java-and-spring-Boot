package com.ferdi.assignment10b.Service;

import com.ferdi.assignment10b.Domain.Student;
import com.ferdi.assignment10b.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student)
    {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }

}
