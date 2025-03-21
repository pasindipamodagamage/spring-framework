package org.example.z13_spring_boot.repo;

import org.example.z13_spring_boot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // component ekak kyl kiynne meken
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
