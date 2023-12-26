package com.example.demo.entities;

import lombok.Data;
import lombok.Value;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table
@Data
public class TransitionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "id_course")
    private int idCourse;
    @Column(name = "id_user")
    private int idUser;
    @Column(name = "register_date")
    private LocalDate registerDate;
    private String status;

}
