package com.example.demo;

import com.example.demo.entities.User;
import com.example.demo.services.CourseService;
import com.example.demo.services.MenuService;
import com.example.demo.services.RoleService;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args)  {
        SpringApplication.run(DemoApplication.class, args);

    }
    @Autowired
    private UserService userService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private RoleService  roleService;
    @Autowired
    private MenuService menuService;

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        userService.UserWithAccountInfo();
    }



    public void findRole() {
        System.out.println("Nhap ten role: ");
        String name =  new java.util.Scanner(System.in).nextLine() ;
        roleService.findRoleByName(name);
    }



}
