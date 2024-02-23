package com.dossantoscarlos.auth.modules.orders;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity(name="orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "codigo_produto")
    private String codigoProduto;

    private float valor;

}
