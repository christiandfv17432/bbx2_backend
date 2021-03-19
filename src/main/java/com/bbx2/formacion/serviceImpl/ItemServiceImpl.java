package com.bbx2.formacion.serviceImpl;

import com.bbx2.formacion.dto.ItemCustomDTO;
import com.bbx2.formacion.dto.ItemDTO;
import com.bbx2.formacion.model.Item;
import com.bbx2.formacion.repository.ItemRespository;
import com.bbx2.formacion.service.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRespository itemRespository;

    ModelMapper mapper = new ModelMapper();




    public List<ItemDTO> findAllItems() {

        List<Item> itemList = itemRespository.findAll();

        if (itemList != null) {

            List<ItemDTO> itemDTOList = new ArrayList<>();

            itemList.forEach((item -> {
                itemDTOList.add(mapper.map(item,ItemDTO.class));
            }));
            return itemDTOList;
        }

        return new ArrayList<ItemDTO>();
    }

    @Override
    public void save(ItemDTO itemResponse) {
        itemRespository.save(mapper.map(itemResponse,Item.class));
    }

    @Override
    public void deleteItem(Long id) {
        if(itemRespository.existsById(id)){
            Optional<Item> item = itemRespository.findById(id);
            itemRespository.delete(item.get());

        }

    }

    @Override
    public ItemDTO getItem(Long id) {
        if(itemRespository.existsById(id)){
            Optional<Item> item = itemRespository.findById(id);
           return mapper.map(item.get(),ItemDTO.class);

        }
        return new ItemDTO();
    }
/*
    @Override
    public List<ItemCustomDTO> findAllItems() {
        List<Item> itemList = itemRespository.findAll();

        if (itemList != null) {

            List<ItemCustomDTO> itemDTOList = new ArrayList<>();

            itemList.forEach((item -> {
                itemDTOList.add(mapper.map(item,ItemCustomDTO.class));
            }));
            return itemDTOList;
        }

        return new ArrayList<ItemCustomDTO>();
    }*/
}
