package com.dossantoscarlos.auth.modules.products;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Table(name = "products")
@Entity(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String description;

}
