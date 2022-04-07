package InventarioTienda.userinvent.controller;

import InventarioTienda.userinvent.controller.dto.InventStoreDto;
import InventarioTienda.userinvent.repository.document.InventStore;
import InventarioTienda.userinvent.service.InventStoreMongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/v1/inventstore")
public class InventStoreController
{
   private final InventStoreMongoDB inventStoreMongoDB;

    public InventStoreController(@Autowired InventStoreMongoDB inventStoreMongoDB) {
        this.inventStoreMongoDB = inventStoreMongoDB;
    }


    @PostMapping
    public InventStore create (@RequestBody InventStoreDto iventStoreDto) {
    return inventStoreMongoDB.create(new InventStore(iventStoreDto));
    }
 }
