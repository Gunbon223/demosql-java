package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table
public class OpenSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "start_date")
    private LocalDate startDate;
    private String address;
    @Column(name = "study_day")
    private String studyDay;
    @Column(name = "study_time")
    private String studyTime;
}
