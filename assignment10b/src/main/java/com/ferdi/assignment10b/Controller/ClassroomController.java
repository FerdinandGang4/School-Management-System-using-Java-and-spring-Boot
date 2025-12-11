package com.ferdi.assignment10b.Controller;

import com.ferdi.assignment10b.Domain.Classroom;
import com.ferdi.assignment10b.Service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/classrooms")
public class ClassroomController {
    @Autowired
    private ClassroomService classroomService;

    @PostMapping
    public Classroom createClassroom(@RequestBody Classroom classroom)
    {
        return classroomService.createClassroom( classroom);
    }

    @GetMapping("/{id}")
    public Optional<Classroom> getClassroomById(@PathVariable Long id)
    {
        return classroomService.getClassroomById(id);
    }

    @GetMapping
    public List<Classroom> getAllClassrooms()
    {
        return classroomService.getAllClassrooms();
    }
}
