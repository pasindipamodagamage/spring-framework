package lk.ijse._13_springboot.controller;

import lk.ijse._13_springboot.dto.CustomerDTO;
import lk.ijse._13_springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: pasindi
 * Date: 2/11/25
 * Time: 3:55 PM
 */
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "save")
    public Boolean getCustomers(@RequestBody CustomerDTO customerDTO){
        Boolean res = customerService.saveCustomer(customerDTO);
        return res;
    }
    
}
