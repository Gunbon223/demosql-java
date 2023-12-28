package com.example.demo.repository;

import com.example.demo.entities.AccountBanking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface AccountBankRepository extends JpaRepository<AccountBanking,Integer> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO `account_banking`(`account_number`, `account_name`, `bank_id`, `user_id`) VALUES ((?),(?),(?),(?))",nativeQuery = true)
    void insertAccountBanking(String accountNumber, String accountName, int bankId, int userId);

}
