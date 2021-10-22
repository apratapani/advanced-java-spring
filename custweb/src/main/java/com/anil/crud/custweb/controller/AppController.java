package com.anil.crud.custweb.controller;

import com.anil.crud.custweb.domain.Customer;
import com.anil.crud.custweb.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
     final List<Customer> customerList = customerService.getCustomers();
     model.addAttribute("customerList",customerList);
     return "index";
 }

}
