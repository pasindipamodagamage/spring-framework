package org.example.z13_spring_boot.service.Impl;

import org.example.z13_spring_boot.dto.ItemDTO;
import org.example.z13_spring_boot.entity.Item;
import org.example.z13_spring_boot.repo.ItemRepo;
import org.example.z13_spring_boot.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void save(ItemDTO itemDTO) {
//        Item item = new Item(
//                itemDTO.getId(),
//                itemDTO.getName(),
//                itemDTO.getDescription(),
//                itemDTO.getQty(),
//                itemDTO.getPrice()
//        );
//        itemRepo.save(item);
        itemRepo.save(modelMapper.map(itemDTO, Item.class));
        throw new RuntimeException("already exist");
    }

    @Override
    public List<ItemDTO> getAll() {
//        List<Item> items = itemRepo.findAll();
//        List<ItemDTO> itemDTOS = new ArrayList<>();
//        for (Item item : items) {
//            itemDTOS.add(new ItemDTO(
//                    item.getId(),
//                    item.getName(),
//                    item.getDescription(),
//                    item.getQty(),
//                    item.getPrice()
//            ));
//        }
//
//        return itemDTOS;
        return modelMapper.map(itemRepo.findAll(), new TypeToken<List<ItemDTO>>() {}.getType());
    }

    @Override
    public void update(ItemDTO itemDTO) {

        Optional<Item> items = itemRepo.findById(itemDTO.getId());
        if (items.isPresent()) {
//            Item item = items.get();
//            item.setName(itemDTO.getName());
//            item.setDescription(itemDTO.getDescription());
//            item.setQty(itemDTO.getQty());
//            item.setPrice(itemDTO.getPrice());

            itemRepo.save(modelMapper.map(itemDTO, Item.class));

        }
        throw new RuntimeException("not exist");
    }

    @Override
    public void delete(int id) {
        itemRepo.deleteById(id);
        throw new RuntimeException("not exist");
    }


}

