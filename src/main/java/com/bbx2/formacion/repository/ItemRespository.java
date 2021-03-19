package com.bbx2.formacion.repository;

import com.bbx2.formacion.dto.ItemDTO;
import com.bbx2.formacion.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ItemRespository extends JpaRepository<Item, Long> {

}
