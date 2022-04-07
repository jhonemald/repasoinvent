package InventarioTienda.userinvent.repository;

import InventarioTienda.userinvent.repository.document.InventStore;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface InventRepository extends MongoRepository <InventStore, String>
{

}
