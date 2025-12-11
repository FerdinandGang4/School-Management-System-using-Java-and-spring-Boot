package com.ferdi.assignment10b.Service;

import com.ferdi.assignment10b.Domain.Course;
import com.ferdi.assignment10b.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServoceImp implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course createCourse(Course caurse) {
       return courseRepository.save(caurse);
    }

    @Override
    public List<Course> getAllCourses()
    {
        return  courseRepository.findAll();
    }
}
