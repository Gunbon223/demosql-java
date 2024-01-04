package com.example.demo.services;

import com.example.demo.DTO.ScheduleCourseDTO;
import com.example.demo.repository.OpeningScheduleRepository;
import com.example.demo.repository.UserDtCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

@Service
public class OpeningScheduleService {
  /*  @Autowired
    private OpeningScheduleRepository openingScheduleRepository;
    public void addOpeningSchedule(Scanner scanner) {
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Nhap ngay bat dau: ");
        String startDateString = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(startDateString);
        System.out.println("Nhap ngay hoc: ");
        String studyDay = scanner.nextLine();
        System.out.println("Nhap thoi gian hoc: ");
        String studyTime = scanner.nextLine();
        openingScheduleRepository.insertSchedule(address, startDate, studyDay, studyTime);*/
    // }

    @Autowired
    private UserDtCourseRepository userDtCourseRepository;

    public void findOpenningDayWithCourseInfo() {
        List<ScheduleCourseDTO> scheduleCourseDTOList = userDtCourseRepository.findOpenningDayWithCourseInfo();
        if (scheduleCourseDTOList == null) {
            System.out.println("No user");
        } else {
            System.out.println(scheduleCourseDTOList.toString());
        }
    }
}
