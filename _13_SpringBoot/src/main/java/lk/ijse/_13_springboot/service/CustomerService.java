package lk.ijse._13_springboot.service;

import lk.ijse._13_springboot.dto.CustomerDTO;
import lk.ijse._13_springboot.entity.Customer;
import lk.ijse._13_springboot.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: pasindi
 * Date: 2/11/25
 * Time: 4:10 PM
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    public Boolean saveCustomer(CustomerDTO customerDTO){
        Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress());
        customerRepo.save(customer);
        return true;

    }
}
