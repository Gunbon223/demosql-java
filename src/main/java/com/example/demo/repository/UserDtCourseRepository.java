package com.example.demo.repository;

import com.example.demo.DTO.ScheduleCourseDTO;
import com.example.demo.entities.UserDeltailCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Entity;
import java.util.List;


public interface UserDtCourseRepository extends JpaRepository<UserDeltailCourse, Integer> {
    @Query("select new com.example.demo.DTO.ScheduleCourseDTO(os.startDate,c.name,c.description,c.courseLength,c.price,c.typeCourse,os.studyDay,c.vote) FROM UserDeltailCourse usd join Course c on c.id = usd.idCourse join OpenSchedule  os ON os.id = usd.idSchedule ")
    List<ScheduleCourseDTO> findOpenningDayWithCourseInfo();
}
