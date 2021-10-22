package com.anil.crud.custweb;

import com.anil.crud.custweb.domain.Customer;
import com.anil.crud.custweb.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class CustwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustwebApplication.class, args);
	}


	@Bean
	public CommandLineRunner loadInitialData(CustomerService customerService) {
		return (args) -> {
			if (customerService.getCustomers().isEmpty()) {
				customerService.saveAllCustomer(Arrays.asList(
						Customer.builder().fullName("Customer 1").emailAddress("customer1@gmail.com").address("Customer Address One").age(30).build(),
						Customer.builder().fullName("Customer 2").emailAddress("customer2@gmail.com").address("Customer Address Two").age(28).build(),
						Customer.builder().fullName("Customer 3").emailAddress("customer3@gmail.com").address("Customer Address Three").age(32).build()));
			}
		};
	}

}
