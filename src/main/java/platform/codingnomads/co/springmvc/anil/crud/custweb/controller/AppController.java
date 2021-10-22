package platform.codingnomads.co.springmvc.anil.crud.custweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import platform.codingnomads.co.springmvc.anil.crud.custweb.domain.Customer;
import platform.codingnomads.co.springmvc.anil.crud.custweb.service.CustomerService;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/ryan")
    public String viewHomePage(Model model) {
     final List<Customer> customerList = customerService.getCustomers();
     model.addAttribute("customerList",customerList);
     return "anil/index";
 }

}
