package lk.ijse._13_springboot.repo;

import lk.ijse._13_springboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: pasindi
 * Date: 2/11/25
 * Time: 4:09 PM
 */
@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
