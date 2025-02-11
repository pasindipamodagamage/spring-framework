package lk.ijse.repository;

import lk.ijse.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: pasindi
 * Date: 2/11/25
 * Time: 2:14 PM
 */

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
