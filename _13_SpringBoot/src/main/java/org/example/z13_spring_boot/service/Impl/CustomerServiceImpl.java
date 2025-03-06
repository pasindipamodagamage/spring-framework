package org.example.z13_spring_boot.service.Impl;

import org.example.z13_spring_boot.dto.CustomerDTO;
import org.example.z13_spring_boot.entity.Customer;
import org.example.z13_spring_boot.repo.CustomerRepo;
import org.example.z13_spring_boot.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void save(CustomerDTO customerDTO) {
//        Customer customer = new Customer(
//                customerDTO.getId(),
//                customerDTO.getName(),
//                customerDTO.getAddress()
//        customerRepo.save(customer);
//        );
        if (customerRepo.existsById(customerDTO.getId())) {
            throw new RuntimeException("Customer already exists");
        }
        customerRepo.save(modelMapper.map(customerDTO, Customer.class));
    }

    @Override
    public List<CustomerDTO> getAll() {
//        List<Customer> customers = customerRepo.findAll();
//        List<CustomerDTO> customerDTOS = new ArrayList<>();
//        for (Customer customer : customers) {
//            customerDTOS.add(new CustomerDTO(
//                    customer.getId(),
//                    customer.getName(),
//                    customer.getAddress()
//
//            ));
//        }
//
//        return customerDTOS;
        return modelMapper.map(customerRepo.findAll(), new TypeToken<List<CustomerDTO>>(){}.getType());
    }

    @Override
    public void update(CustomerDTO customerDTO) {

        Optional<Customer> customers = customerRepo.findById(customerDTO.getId());
        if (customers.isPresent()) {
//            Customer customer = customers.get();
//            customer.setName(customerDTO.getName());
//            customer.setAddress(customerDTO.getAddress());
//            customerRepo.save(customer);
            customerRepo.save(modelMapper.map(customerDTO, Customer.class));
        }
        throw new RuntimeException("Customer not found");
    }

    @Override
    public void delete(int id) {
            customerRepo.deleteById(id);
            throw new RuntimeException("Customer not found");
        }

    }

