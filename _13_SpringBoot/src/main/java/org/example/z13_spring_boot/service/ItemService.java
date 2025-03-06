package org.example.z13_spring_boot.service;

import org.example.z13_spring_boot.dto.ItemDTO;
import java.util.List;

public interface ItemService {
    void save(ItemDTO itemDTO);

    List<ItemDTO> getAll();

    void update(ItemDTO itemDTO);

    void delete(int id);

}
