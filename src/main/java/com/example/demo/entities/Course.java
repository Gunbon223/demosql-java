package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "course_length")
    private String courseLength;
    private String description;
    private BigDecimal price;
    @Column(name = "type_course")
    private String typeCourse;
    private int vote;
}
