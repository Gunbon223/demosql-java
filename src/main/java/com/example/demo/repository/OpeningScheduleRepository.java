package com.example.demo.repository;

import com.example.demo.entities.OpenSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

public interface OpeningScheduleRepository extends JpaRepository<OpenSchedule,Integer> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO `open_schedule`(`address`, `start_date`, `study_day`, `study_time`) VALUES ((?),(?),(?),(?))",nativeQuery = true)
    void insertSchedule(String address, LocalDate startdate,String studyDay,String studyTime);

}
