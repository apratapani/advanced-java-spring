package platform.codingnomads.co.springmvc.anil.crud.custweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import platform.codingnomads.co.springmvc.anil.crud.custweb.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
