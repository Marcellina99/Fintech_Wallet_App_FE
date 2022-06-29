package com.example.springbootapptask.service;

import com.example.springbootapptask.dto.CustomerResponseDto;
import com.example.springbootapptask.dto.UpdateCustomerDto;
import com.example.springbootapptask.dto.CustomerSignUpDto;
import com.example.springbootapptask.models.Customer;

import java.util.List;

public interface CustomerService {
    Customer create(CustomerSignUpDto customerSignUpDto);
    List<CustomerResponseDto> getAllCustomers();
    CustomerResponseDto getCustomer(Long id);
    void deleteCustomer(Long id);
    Customer updateCustomer(UpdateCustomerDto updateCustomerDto, String email);
}
