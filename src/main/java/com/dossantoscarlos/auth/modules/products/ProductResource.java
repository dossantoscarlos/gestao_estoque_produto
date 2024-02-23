package com.dossantoscarlos.auth.modules.products;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dossantoscarlos.auth.core.config.Error.HandlerResponseExceptionApiController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/products")
public class ProductResource extends HandlerResponseExceptionApiController {

    private final ProductService productService;

    public ProductResource(final ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Product> getProductAll() {
        return this.productService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Product>create(@RequestBody @Valid ProductCreateDTO product) {
        
        var productModel = new Product();

        productModel.setName(product.produto());
        productModel.setDescription(product.description());

        var productCreate = this.productService.save(productModel);
        //URI uri = URI.create("products/" + product.getId());
        //return (ResponseEntity) ResponseEntity.created(uri);
        return ResponseEntity.ok(productCreate);
    }
}
