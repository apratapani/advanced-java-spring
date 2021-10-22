package com.anil.crud.custweb.service;

import com.anil.crud.custweb.domain.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();
    Customer saveCustomer(Customer customer);
    Customer getCustomer(Long id);
    void deleteCustomer(Long id);
    List<Customer> saveAllCustomer(List<Customer> customerList);
}
