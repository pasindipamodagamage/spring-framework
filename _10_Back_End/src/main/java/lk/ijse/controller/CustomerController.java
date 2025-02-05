package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: pasindi
 * Date: 2/5/25
 * Time: 3:02 PM
 */
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    ArrayList<CustomerDTO> customers = new ArrayList<>();
    @PostMapping(path = "save")
    public CustomerDTO saveCustomer (@RequestBody CustomerDTO customerDTO){
        customers.add(customerDTO);
        return customerDTO;
    }

    @PutMapping(path = "update")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO){
        for (CustomerDTO customer : customers) {
            if (customer.getId().equals(customerDTO.getId())) {
                customer.setName(customerDTO.getName());
                customer.setAddress(customerDTO.getAddress());
                customer.setAge(customerDTO.getAge());
                return customer;
            }
        }
        return null;
    }
    @GetMapping(path = "getAll")
    public List<CustomerDTO> getAllCustomers(){
        ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();
        return customerDTOS;
    }
    @DeleteMapping(path = "delete/{id}")
    public boolean deleteCustomer(@PathVariable (value = "id")String id){
        for (int i = 0; i < customers.size(); i++) {
            CustomerDTO excitingCustomer = customers.get(i);
            if (excitingCustomer.getId().equals(id)){
                customers.remove(i);
                return true;
            }
        }
        return false;
    }
}