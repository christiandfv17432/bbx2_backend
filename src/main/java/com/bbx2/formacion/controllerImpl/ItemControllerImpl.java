package com.bbx2.formacion.controllerImpl;

import com.bbx2.formacion.controller.ItemController;
import com.bbx2.formacion.dto.ItemDTO;
import com.bbx2.formacion.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/saveItem")
    public void createItem(ItemDTO itemDTO) {
        itemService.save(itemDTO);
    }

    @DeleteMapping("/deleteItem/{id}")
    public void deleteItem(@RequestParam(name = "id",required = true) Long id) {
        itemService.deleteItem(id);
    }

    @GetMapping("/getItemById/{id}")
    public ItemDTO getItem(@RequestParam(name = "id",required = true) Long id) {
        return itemService.getItem(id);
    }
}
