package InventarioTienda.userinvent.controller.dto;

public class InventStoreDto {

    private final String nameProduct;
    private final long price;

    public InventStoreDto(String nameProduct, long price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public long getPrice() {
        return price;
    }
}
