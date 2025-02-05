package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

/**
 * Author: pasindi
 * Date: 2/5/25
 * Time: 1:33 PM
 */
@RestController
@RequestMapping("form")
public class FormDataController {
//    @PostMapping
//    public String test1(){
//        return "test 1";
//    }

//    http://localhost:8080/_09_RestController_war_exploded/form
//    @PostMapping
//    public  String test1(@RequestParam(value = "id") String id,
//    @RequestParam(value = "name") String name){
//        return id+" "+name;
//    }

    @PostMapping
    public String test2(@ModelAttribute CustomerDTO customerDTO){
        return customerDTO.toString();
    }
}
