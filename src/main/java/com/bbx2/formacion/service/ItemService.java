package com.bbx2.formacion.service;

import com.bbx2.formacion.dto.ItemCustomDTO;
import com.bbx2.formacion.dto.ItemDTO;
import com.bbx2.formacion.response.ItemResponse;

import java.util.List;

public interface ItemService {

    List<ItemDTO> findAllItems();
     void save(ItemDTO itemDTO);
     void deleteItem(Long id);
     ItemDTO getItem(Long id);
    // List<ItemCustomDTO> findAllItems();


}
