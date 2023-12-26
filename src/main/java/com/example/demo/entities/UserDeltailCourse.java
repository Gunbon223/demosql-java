package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class UserDeltailCourse {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_user")
    private int idUser;
@Column(name = "id_course")
    private int idCourse;
@Column(name = "id_schedule")
    private int idSchedule;
}
