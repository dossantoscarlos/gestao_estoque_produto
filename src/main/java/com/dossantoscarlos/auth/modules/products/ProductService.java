package com.dossantoscarlos.auth.modules.products;

import org.springframework.stereotype.Service;


@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(final ProductRepository productRepository ) {
        this.productRepository = productRepository;
    }

    public Product save( Product product) {
        return this.productRepository.save(product);
    }

    public Iterable<Product> getAll() {
        return this.productRepository.findAll();
    }

}
