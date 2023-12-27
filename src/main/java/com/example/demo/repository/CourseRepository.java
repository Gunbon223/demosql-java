package com.example.demo.repository;

import com.example.demo.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    @Query(value = "select  * from Course where course_length like'6%' and price = 4500 and vote >3",nativeQuery = true)
    List<Course> findByCourseLength();
}
