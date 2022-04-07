package InventarioTienda.userinvent.service;

import InventarioTienda.userinvent.repository.InventRepository;
import InventarioTienda.userinvent.repository.document.InventStore;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventStoreMongoDB  implements InventStoreService
{

    private final InventRepository inventRepository;


    public InventStoreMongoDB(InventRepository inventRepository) {
        this.inventRepository = inventRepository;
    }

    @Override
    public InventStore create(InventStore inventStore) {
        return inventRepository.save(inventStore);
    }

    @Override
    public Optional<InventStore> findByNameProduct(String nameProduct) {
        return Optional.empty();
    }

    @Override
    public Optional<InventStore> findById(String id) {
        return Optional.empty();
    }
}
