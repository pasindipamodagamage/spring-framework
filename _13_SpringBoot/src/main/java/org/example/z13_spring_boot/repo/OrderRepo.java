package org.example.z13_spring_boot.repo;

import org.example.z13_spring_boot.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepo extends JpaRepository<Order,Integer> {

    @Query(value = "SELECT * FROM orders ORDER BY id DESC LIMIT 1;", nativeQuery = true)
    Order getLastOrder();

}
