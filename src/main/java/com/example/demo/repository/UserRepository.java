package com.example.demo.repository;

import com.example.demo.DTO.UserAccDTO;
import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "select  * from User where id = ?",nativeQuery = true)
    User findByUserid(int id);
    @Query(value = "select  * from User where phone = ?",nativeQuery = true)
    User findByUserPhone(String phone);

    @Query("SELECT new com.example.demo.DTO.UserAccDTO(u.email,u.name,u.phone,ab.accountName,ab.accountNumber)  FROM User u JOIN AccountBanking ab ON u.bankId = ab.id")
    List<UserAccDTO> findUserWithAccountInfo();


    @Modifying
    @Transactional
    @Query(value = "INSERT INTO `user`( `bank_id`, `email`, `name`, `phone`, `role_id`) VALUES ((?),(?),(?),(?),(?))",nativeQuery = true)
    void insertUser(int bankId,String email,String name,String phone,int roleId);

    @Modifying
    @Transactional
    @Query(value = "UPDATE `user` SET `bank_id`=(?),`email`=(?),`name`=(?),`role_id`=(?) WHERE phone = (?1)",nativeQuery = true)
    void updateUser(String phone, int bank_id,String email,String name,int roleId);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `user` WHERE phone = (?1)",nativeQuery = true)
    void deleteUser(String phone);

}
