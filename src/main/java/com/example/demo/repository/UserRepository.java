package com.example.demo.repository;

import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "select  * from User where id = ?",nativeQuery = true)
    User findByUserid(int id);
    @Query(value = "select  * from User where name = ? ",nativeQuery = true)
    List<User> findByUserName(String name);
}
