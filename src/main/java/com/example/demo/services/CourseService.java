package com.example.demo.services;

import com.example.demo.entities.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public void findCourseByLength() {
        List<Course> courseList = courseRepository.findByCourseLength();
        if (courseList.isEmpty()) {
            System.out.println("Khong tim thay khoa hoc");
        }
        for (int i = 0; i < courseList.size(); i++) {
            System.out.println(courseList.get(i));
        }
    }

}
