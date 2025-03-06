package org.example.z13_spring_boot.controller;

import org.example.z13_spring_boot.dto.*;
import org.example.z13_spring_boot.service.Impl.CustomerServiceImpl;
import org.example.z13_spring_boot.service.Impl.ItemServiceImpl;
import org.example.z13_spring_boot.service.Impl.OrderServiceImpl;
import org.example.z13_spring_boot.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("api/v1/orders")
@CrossOrigin
public class PlaceOrderController {
    @Autowired
    private ResponseDTO responseDTO;
    @Autowired
    private CustomerServiceImpl customerService;

    @Autowired
    private ItemServiceImpl itemService;

    @Autowired
    private OrderServiceImpl orderService;

    @Autowired
    private ItemDTO itemDTO = new ItemDTO();

    @PostMapping("/placeOrder")
    public ResponseEntity placeOrder(@RequestBody PlaceOrderDTO placeOrderDTO){
        System.out.println("data awa hutto");
        System.out.println("sadassad" +placeOrderDTO.getOrderDTO().getCustomer().getName());
        System.out.println("sadassad" +placeOrderDTO.getOrderDTO().getCustomer().getName());
        System.out.println("sadasssdasdasad" +placeOrderDTO);
        try{
//            CustomerDTO customerDTO = customerService.FindByID(placeOrderDTO.getOrderDTO().getCustomer().getId());
            OrderDTO orderDTO = new OrderDTO();
            orderDTO.setId(1);
//            orderDTO.setCustomer(customerDTO);
            orderDTO.setTotal(placeOrderDTO.getOrderDTO().getTotal());

            List<OrderDetailDTO> orderDetailDTO = new ArrayList<OrderDetailDTO>();
            for (OrderDetailDTO orderDetailDTO1 : placeOrderDTO.getOrderDetailsDTO()) {
//                ItemDTO itemDTO = itemService.FindByID(orderDetailDTO1.getItem().getId());
//                System.out.println("Item    "+itemDTO);
//                orderDetailDTO.add(new OrderDetailDTO(orderDetailDTO1.getId(),orderDetailDTO1.getQty(),orderDetailDTO1.getPrice(),orderDTO,itemDTO));}
            orderDetailDTO.add(new OrderDetailDTO(orderDetailDTO1.getId(),orderDetailDTO1.getQty(),orderDetailDTO1.getPrice(),orderDTO,itemDTO));}

        PlaceOrderDTO placeOrderDTO1 = new PlaceOrderDTO();
            placeOrderDTO1.setOrderDTO(orderDTO);
            placeOrderDTO1.setOrderDetailsDTO(orderDetailDTO);

            System.out.println("sadassad     " +placeOrderDTO1.getOrderDTO().getCustomer().getName());
            System.out.println("sadasssdasdasad      " +placeOrderDTO1);

            orderService.placeOrder(placeOrderDTO1);
//            responseDTO.setCode(VarList.RSP_SUCCESS);
//            responseDTO.setMessage("Order placed successfully");
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
