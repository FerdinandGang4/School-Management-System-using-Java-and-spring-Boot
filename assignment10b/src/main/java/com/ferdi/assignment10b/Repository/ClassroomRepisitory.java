package com.ferdi.assignment10b.Repository;

import com.ferdi.assignment10b.Domain.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepisitory extends JpaRepository<Classroom, Long> {
}
