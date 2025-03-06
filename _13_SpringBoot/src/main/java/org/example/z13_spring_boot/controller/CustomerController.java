package org.example.z13_spring_boot.controller;

import org.example.z13_spring_boot.dto.CustomerDTO;
import org.example.z13_spring_boot.service.Impl.CustomerServiceImpl;
import org.example.z13_spring_boot.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {
    private List<CustomerDTO> customers = new ArrayList<>();
    @Autowired
    private CustomerServiceImpl customerService;

    @PostMapping(path = "save")
    public ResponseUtil saveCustomer(@RequestBody CustomerDTO customerDTO) {
         customerService.save(customerDTO);
        return new ResponseUtil(201, "Customer is Saved", null);

    }

    @GetMapping(path = "getAll")
    public ResponseUtil getAllCustomers() {
        return new ResponseUtil(404,"not found", customerService.getAll());
//        return customerService.getAll();
    }

    @PutMapping(path = "update")
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.update(customerDTO);
        return new ResponseUtil(200, "Customer is Updated", null);
    }

    @DeleteMapping(path = "delete/{id}")
    public ResponseUtil deleteCustomer(@PathVariable(value = "id") int id) {
        customerService.delete(id);
            return new ResponseUtil(200, "Customer Deleted", null);
    }

}
