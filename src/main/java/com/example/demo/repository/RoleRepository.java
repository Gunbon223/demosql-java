package com.example.demo.repository;

import com.example.demo.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Integer>
{
    @Query(value = "select  * from Role where id = ?",nativeQuery = true)
    Role findByRoleid(int id);
}
