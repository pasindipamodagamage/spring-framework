package org.example.z13_spring_boot.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetailDTO {
    private int id;
    private int qty;
    private double price;
    private OrderDTO order;
    private ItemDTO item;
}
