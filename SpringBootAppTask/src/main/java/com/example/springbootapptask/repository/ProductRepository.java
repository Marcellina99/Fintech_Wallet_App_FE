package com.example.springbootapptask.repository;

import com.example.springbootapptask.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long>{

}
