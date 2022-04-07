package InventarioTienda.userinvent.repository.document;

import InventarioTienda.userinvent.controller.dto.InventStoreDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class InventStore {

    @Id
    private String id;
    private String nameProduct;
    private long price;



    public InventStore() {
    }

    public InventStore(String id, String nameProduct, long price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public InventStore(InventStoreDto inventStoreDto) {
        this (null,inventStoreDto.getNameProduct(),inventStoreDto.getPrice());
    }

    public String getId() {
        return id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
