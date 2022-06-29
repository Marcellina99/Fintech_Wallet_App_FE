package com.example.springbootapptask.service;

import com.example.springbootapptask.models.Product;
import com.example.springbootapptask.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;
    public List<Product> listAll(){
        return repo.findAll();
    }

    public void save(Product product){
        repo.save(product);
    }

    public Product get(Long id){
        return repo.findAllById(Collections.singleton(id)).get(id.intValue());
    }

    public void delete(Long id){
        repo.deleteById(id);
    }
}
