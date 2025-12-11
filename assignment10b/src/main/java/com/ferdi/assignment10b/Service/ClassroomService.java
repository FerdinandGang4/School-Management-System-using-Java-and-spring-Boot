package com.ferdi.assignment10b.Service;

import com.ferdi.assignment10b.Domain.Classroom;
import org.springframework.stereotype.Service;

import javax.swing.plaf.PanelUI;
import java.util.List;
import java.util.Optional;


public interface ClassroomService {
    public Classroom createClassroom(Classroom classroom);
    public Optional<Classroom> getClassroomById(Long id);
    public List<Classroom> getAllClassrooms();
}
