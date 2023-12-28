package com.example.demo.services;

import com.example.demo.repository.AccountBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class AccountBankingService {
    @Autowired
    private AccountBankRepository accountBankRepository;

    public void addBankAccount(Scanner scanner) {
        System.out.println("Nhap so tai khoan: ");
        String accountNum = scanner.nextLine();
        System.out.println("Nhap ten tai khoan: ");
        String accountName = scanner.nextLine();
        System.out.println("Nhap id tai khoan: ");
        int bankId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap id nguoi dung: ");
        int userId = Integer.parseInt(scanner.nextLine());
        accountBankRepository.insertAccountBanking(accountNum, accountName, bankId, userId);
    }

}
