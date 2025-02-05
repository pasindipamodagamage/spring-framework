package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;

/**
 * Author: pasindi
 * Date: 2/5/25
 * Time: 2:03 PM
 */
@RestController
@RequestMapping("json")
public class JsonController {

    @PostMapping
    public String jsonObject(@RequestBody CustomerDTO customerDTO){
        return customerDTO.toString();
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerDTO test2(){
        return new CustomerDTO("p","p",12);
    }

    @GetMapping(path = "data",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<CustomerDTO> test3(){
        ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();
        customerDTOS.add(new CustomerDTO("chanuka", "prabodha", 20));
        customerDTOS.add(new CustomerDTO("chanuka", "prabodha", 25));
        customerDTOS.add(new CustomerDTO("chanuka", "prabodha", 21));
        return customerDTOS;
    }
}
