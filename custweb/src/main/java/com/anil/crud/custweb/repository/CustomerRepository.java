package com.anil.crud.custweb.repository;

import com.anil.crud.custweb.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
