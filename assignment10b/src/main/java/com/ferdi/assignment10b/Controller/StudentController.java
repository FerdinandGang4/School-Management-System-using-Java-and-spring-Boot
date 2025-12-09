package com.ferdi.assignment10b.Controller;

import com.ferdi.assignment10b.Domain.Student;
import com.ferdi.assignment10b.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student)
    {
        return studentService.createStudent(student);
    }

    @GetMapping
    public List<Student> getStudents()
    {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudent(@PathVariable Long id)
    {
        return studentService.getStudentById(id);
    }
}
