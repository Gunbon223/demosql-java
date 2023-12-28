package com.example.demo.repository;

import com.example.demo.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    @Query(value = "select  * from Course where course_length like'6%' and price = 4500 and vote >3",nativeQuery = true)
    List<Course> findByCourseLength();

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO `course`( `course_length`, `description`, `name`, `price`, `type_course`, `vote`) VALUES ((?),(?),(?),(?),(?),(?))",nativeQuery = true)
    void insertCourse(String courseLength, String des, String name, BigDecimal price,String typeCourse,String vote);
}
