package com.example.springbootproject.models;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Admin {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "admin_role", joinColumns = @JoinColumn(name = "admin_id", referencedColumnName = "admin-id"),
    inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id"))
    private Collection<Role> roles;
}
