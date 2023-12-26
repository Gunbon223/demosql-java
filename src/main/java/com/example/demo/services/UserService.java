package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    public void findUserbyName(String name) {
        List<User> userMap =  userRepository.findByUserName(name);
        if (userMap.isEmpty()) {
            System.out.println("Khong tim thay user ten" + name);
        }
        for (int i = 0; i < userMap.size(); i++) {
            System.out.println(userMap.get(i));
        }
    }
}
