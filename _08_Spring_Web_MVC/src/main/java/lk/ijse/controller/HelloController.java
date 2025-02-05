package lk.ijse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: pasindi
 * Date: 1/29/25
 * Time: 2:49 PM
 */
//@RestController
@Controller
@RequestMapping("hello")
public class HelloController {
    HelloController(){
        System.out.println("HelloController");
    }

    @GetMapping
    public String Hello(){
        return "index";
    }

}
