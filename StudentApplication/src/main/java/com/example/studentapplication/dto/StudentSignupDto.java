package com.example.studentapplication.dto;

import lombok.Data;

@Data
public class StudentSignupDto {
    private String name;
    private String email;
    private String password;
    private String address;
}
