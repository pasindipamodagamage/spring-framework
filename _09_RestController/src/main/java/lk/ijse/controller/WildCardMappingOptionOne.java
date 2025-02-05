package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: pasindi
 * Date: 2/5/25
 * Time: 11:29 AM
 */
@RestController
@RequestMapping("one")
public class WildCardMappingOptionOne {

//  CAN CHANGE ANY VALUE TO *
    @GetMapping("test/*/hello")
    public String test(){
        return "test get mapping involke";
    }

    @GetMapping("test/*/*")
    public String test2(){
        return "test get mapping involke";
    }

}
