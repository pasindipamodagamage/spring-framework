package lk.ijse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: pasindi
 * Date: 1/29/25
 * Time: 3:30 PM
 */
//@RestController
@Controller
@RequestMapping("test")
public class TestController {

//    mapping method, handler method
    @GetMapping
    public String test(){
        return "test";
    }
}
