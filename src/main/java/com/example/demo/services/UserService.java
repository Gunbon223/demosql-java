package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.entities.UserWithAccInfo;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void findUserById(int id) {
        User user = userRepository.findByUserid(id);
        if (user == null) {
            System.out.println("User not found");
        }
        else {
            System.out.println(user.toString());
        }
    }

    public void UserWithAccountInfo() {
        List<UserWithAccInfo>  userWithAccountInfoList = userRepository.findUserWithAccountInfoById();
        if (userWithAccountInfoList == null) {
            System.out.println("User not found");
        } else {
            System.out.println(userWithAccountInfoList.toString());
        }
    }



    public boolean findUserByPhone(String phone) {
        User user = userRepository.findByUserPhone(phone);
        if (user == null) {
            System.out.println("Khong tim thay user co so dien thoai " + phone);
            return false;
        } else {
            System.out.println(user.toString());
            return true;
        }
    }

    public void addUser(Scanner scan) {
        System.out.println("Nhap ten user: ");
        String name = scan.nextLine();
        System.out.println("Nhap sdt user: ");
        String phone = scan.nextLine();
        System.out.println("Nhap email user: ");
        String email = scan.nextLine();
        System.out.println("Nhap bank_id user: ");
        int bankId = Integer.parseInt(scan.nextLine());
        System.out.println("Nhap role_id user: ");
        int roleId = Integer.parseInt(scan.nextLine());
        userRepository.insertUser(bankId,email,name,phone,roleId);
        System.out.println("Insert thanh cong");
    }

    public void updateUser(Scanner scanner) {
        System.out.println("Nhap sdt user can update: ");
        String phone = scanner.nextLine();
        if (findUserByPhone(phone)) {
            System.out.println("Nhap ten user: ");
            String name = scanner.nextLine();
            System.out.println("Nhap email user: ");
            String email = scanner.nextLine();
            System.out.println("Nhap bank_id user: ");
            int bank_id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap role_id user: ");
            int roleId = Integer.parseInt(scanner.nextLine());
            userRepository.updateUser(phone, bank_id, email, name, roleId);
            System.out.println("Update thanh cong");
        }
        else {
            System.out.println("Khong co user sdt "+ phone);
        }
    }

    public void deleteUser(Scanner scanner) {
        System.out.println("Nhap sdt user: ");
        String phone = scanner.nextLine();
        if (findUserByPhone(phone)) {
            userRepository.deleteUser(phone);
            System.out.println("Delete thanh cong");
        }
        else {
            System.out.println("Khong co user sdt "+ phone);
        }
    }


}
