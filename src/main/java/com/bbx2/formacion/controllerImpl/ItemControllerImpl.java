package com.bbx2.formacion.controllerImpl;

import com.bbx2.formacion.controller.ItemController;
import com.bbx2.formacion.dto.ItemDTO;
import com.bbx2.formacion.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/item")
public class ItemControllerImpl implements ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("/findAllItems")
    public List<ItemDTO> getAllItems() {
        return itemService.findAllItems();
    }
}
