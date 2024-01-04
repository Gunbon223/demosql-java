package com.example.demo.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserAccDTO {
    private String email;
    private String name;
    private String phone;
    private String accountName;
    private int accountNumber;


}
