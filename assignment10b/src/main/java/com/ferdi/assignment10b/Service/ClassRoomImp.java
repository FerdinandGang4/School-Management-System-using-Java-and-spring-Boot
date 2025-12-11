package com.ferdi.assignment10b.Service;

import com.ferdi.assignment10b.Domain.Classroom;
import com.ferdi.assignment10b.Domain.Course;
import com.ferdi.assignment10b.Repository.ClassroomRepisitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ClassRoomImp implements ClassroomService{
    @Autowired
    private ClassroomRepisitory classroomRepisitory;
    @Override
    public Classroom createClassroom(Classroom classroom) {
        return classroomRepisitory.save(classroom);
    }

    @Override
    public Optional<Classroom> getClassroomById(Long id) {
        return classroomRepisitory.findById(id);
    }

    @Override
    public List<Classroom> getAllClassrooms() {
        return classroomRepisitory.findAll();
    }
}
