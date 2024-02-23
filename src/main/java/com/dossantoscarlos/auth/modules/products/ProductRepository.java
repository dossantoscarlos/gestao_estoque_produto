package com.dossantoscarlos.auth.modules.products;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<Product, UUID> {

}
