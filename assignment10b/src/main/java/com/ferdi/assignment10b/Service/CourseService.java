package com.ferdi.assignment10b.Service;

import com.ferdi.assignment10b.Domain.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public Course createCourse(Course caurse);
    public List< Course> getAllCourses();
}
