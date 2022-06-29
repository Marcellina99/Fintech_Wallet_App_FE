package com.example.springbootapptask.controller;

import com.example.springbootapptask.models.Product;
import com.example.springbootapptask.service.ProductService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String viewHomePage(){
        List<Product> listproducts = service.listAll();
        model.addAttribute("listProducts", listProducts);

      return "index";
    }
}
