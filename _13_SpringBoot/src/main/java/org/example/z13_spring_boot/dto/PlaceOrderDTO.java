package org.example.z13_spring_boot.dto;

import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class PlaceOrderDTO {
    private OrderDTO orderDTO;
    private List<OrderDetailDTO> orderDetailsDTO;
}
