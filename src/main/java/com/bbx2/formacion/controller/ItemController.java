package com.bbx2.formacion.controller;

import com.bbx2.formacion.dto.ItemCustomDTO;
import com.bbx2.formacion.dto.ItemDTO;
import com.bbx2.formacion.response.ItemResponse;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ItemController {

     List<ItemDTO> getAllItems();
     void createItem(@RequestBody ItemDTO itemDTO);
     void deleteItem(Long id);
     ItemDTO getItem(Long id);
    // List<ItemCustomDTO> getAllItemsCustom();
}
