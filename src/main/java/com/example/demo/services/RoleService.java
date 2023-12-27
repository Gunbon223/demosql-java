package com.example.demo.services;

import com.example.demo.entities.Role;
import com.example.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;
    public void findRoleByName(String name) {
       Role role = roleRepository.findByRoleName(name);
        if (role == null) {
            System.out.println("Role not found");
        }
        else {
            System.out.println(role.toString());
        }
    }
}
