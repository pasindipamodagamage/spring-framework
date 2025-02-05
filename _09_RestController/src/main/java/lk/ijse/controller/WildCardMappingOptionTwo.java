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
@RequestMapping("two")
public class WildCardMappingOptionTwo {

//    @GetMapping(path = "test/**/hello")
    public String test(){
        return "test get mapping involke";
    }

}
