package com.example.springbootmainproject.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class CustomerSignupDto {
    @Id

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
