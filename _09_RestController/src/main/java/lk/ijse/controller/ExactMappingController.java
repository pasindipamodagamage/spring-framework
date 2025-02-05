package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: pasindi
 * Date: 2/5/25
 * Time: 11:19 AM
 */

@RestController
@RequestMapping("exact")
public class ExactMappingController {
    @GetMapping(path = "test1")
    public String exactMapping(){
        return "Get Mapping";
    }
    @GetMapping(path = "test2/exam/1234")
    public String exactMapping2(){
        return "Get Mapping involke (test2/exam/1234)";
    }

}
