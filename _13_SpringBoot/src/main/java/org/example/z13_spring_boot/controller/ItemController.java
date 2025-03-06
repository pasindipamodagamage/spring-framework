package org.example.z13_spring_boot.controller;

import org.example.z13_spring_boot.dto.ItemDTO;
import org.example.z13_spring_boot.service.Impl.ItemServiceImpl;
import org.example.z13_spring_boot.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

    @RestController
    @RequestMapping("api/v1/item")
    @CrossOrigin
    public class ItemController {
        private List<ItemDTO> items = new ArrayList<>();
        @Autowired
        private ItemServiceImpl itemService;

        @PostMapping(path = "save")
        public ResponseUtil saveItem(@RequestBody ItemDTO itemDTO){
            itemService.save(itemDTO);
            return new ResponseUtil(200,"successful",null);
        }

        @GetMapping(path = "getAll")
        public ResponseUtil getAllItems(){
            return new ResponseUtil(200,"sucessfull",itemService.getAll());
        }

        @PutMapping(path = "update")
        public ResponseUtil updateItem(@RequestBody ItemDTO itemDTO){
            itemService.update(itemDTO);
            return new ResponseUtil(200,"successful",null);
        }
        @DeleteMapping(path = "delete/{id}")
        public ResponseUtil deleteItem(@PathVariable(value = "id") int id) {
            itemService.delete(id);
            return new ResponseUtil(200,"successful",null);
        }
    }


