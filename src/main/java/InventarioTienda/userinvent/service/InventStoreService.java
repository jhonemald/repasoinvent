package InventarioTienda.userinvent.service;

import InventarioTienda.userinvent.repository.document.InventStore;

import java.util.Optional;

public interface InventStoreService
{
    InventStore create( InventStore inventStore);

    Optional<InventStore> findByNameProduct(String nameProduct);
    Optional<InventStore> findById(String id);
}
