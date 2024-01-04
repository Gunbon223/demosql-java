package com.example.demo.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ScheduleCourseDTO {
    private LocalDate courseStartDate;
    private String courseName;
    private String courseDescription;
    private String courseLength;
    private BigDecimal coursePrice;
    private String courseType;
    private String courseStudyDay;
    private int courseVote;



}
