package com.example.demo.services;

import com.example.demo.entities.OpenSchedule;
import com.example.demo.entities.User;
import com.example.demo.repository.UserDtCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class MenuService {
    @Autowired
    UserService userService;
    @Autowired
    OpeningScheduleService openingScheduleService;
    public void displayMenu(Scanner scanner) {
        String choice = "";
        while (!choice.equalsIgnoreCase("n") ) {
            System.out.println("-------Menu QLy nguoi dung-------");
            System.out.println("1. Tim user theo sdt");
            System.out.println("2. Insert user");
            System.out.println("3. Update user theo sdt");
            System.out.println("4. Delete user theo sdt");
            System.out.println("5. Hien user theo cung tt ngan hang");
            System.out.println("6. Hien lich khai giang theo cung tt khoa hoc");
            System.out.println("Nhap lua chon: ");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    System.out.println("Nhap sdt user can tim");
                    String phone = scanner.nextLine();
                    userService.findUserByPhone(phone);
                    break;
                case 2:
                    userService.addUser(scanner);
                    break;
                case 3:
                    userService.updateUser(scanner);
                    break;
                case 4:
                    userService.deleteUser(scanner);
                    break;
                case 5:
                    userService.UserWithAccountInfo();
                    break;
                case 6:
                    openingScheduleService.findOpenningDayWithCourseInfo();
                    break;
            }
            System.out.println("Tiep tuc chuong trinh? (Y/N)");
            choice = scanner.nextLine();
        }
    }

}
