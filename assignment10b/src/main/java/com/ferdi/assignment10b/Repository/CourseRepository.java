package com.ferdi.assignment10b.Repository;

import com.ferdi.assignment10b.Domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
