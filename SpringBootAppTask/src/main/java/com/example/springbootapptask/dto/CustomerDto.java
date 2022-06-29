package com.example.springbootapptask.dto;

import lombok.Data;

public class CustomerDto {

    @Data
    public class CustomerResponseDto {
        private String name;
        private int age;
        private String email;
    }

}
