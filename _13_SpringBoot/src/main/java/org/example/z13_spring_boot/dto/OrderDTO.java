package org.example.z13_spring_boot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class OrderDTO {
    private int id;
    private double total;
    private CustomerDTO customer;
}
