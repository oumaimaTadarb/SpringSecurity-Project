package com.xproce.repository;

import com.xproce.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    List<Customer> findByEmail(String username);
}
