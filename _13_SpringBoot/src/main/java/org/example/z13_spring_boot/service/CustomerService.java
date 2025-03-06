package org.example.z13_spring_boot.service;

import org.example.z13_spring_boot.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void save(CustomerDTO customerDTO);

    List<CustomerDTO> getAll();

    void update(CustomerDTO customerDTO);

    void delete(int id);

}
