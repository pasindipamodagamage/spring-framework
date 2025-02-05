package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: pasindi
 * Date: 2/5/25
 * Time: 1:16 PM
 */
@RestController
@RequestMapping("params")
public class ParamsController {

//        required false karama value ekak ewanna aniwarya ne. hebei param eka dennone
    @GetMapping(params = {"id"})
    public String test1(@RequestParam(value = "id",required = false) String id){
        return id;
    }

    @GetMapping(params = {"id","name"})
    public String test2(@RequestParam(value = "id",required = false) String id, @RequestParam("name") String name){
        return id+" "+name;
    }


}
