package com.bbx2.formacion.serviceImpl;

import com.bbx2.formacion.dto.ItemDTO;
import com.bbx2.formacion.model.Item;
import com.bbx2.formacion.repository.ItemRespository;
import com.bbx2.formacion.service.ItemService;
import org.mapstruct.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRespository itemRespository;


    public List<ItemDTO> findAllItems() {

        List<Item> itemList = itemRespository.findAll();
        if (itemList != null) {

            List<ItemDTO> itemDTOList = new ArrayList<>();

            itemList.forEach((item -> {
                itemDTOList.add(new ModelMapper().map(item, ItemDTO.class));
            }));

            return itemDTOList;
        }

        return new ArrayList<ItemDTO>();
    }
}
