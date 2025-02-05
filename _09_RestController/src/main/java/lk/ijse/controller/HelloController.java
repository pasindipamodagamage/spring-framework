package lk.ijse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Author: pasindi
 * Date: 1/29/25
 * Time: 2:49 PM
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String Hello(){
        return "Hello World";
    }

    @PostMapping
    public String post(){
        return "Post Mapping";
    }

    @PutMapping
    public String put(){
        return "Put Mapping";
    }

    @DeleteMapping
    public String delete(){
        return "Delete Mapping";
    }

    @PatchMapping
    public String patch(){
        return "Patch mapping";
    }
}
