package com.dossantoscarlos.auth.modules.orders;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    private final OrdersRepository repository;

    public OrdersService(OrdersRepository repository) {
        this.repository= repository;
    }

    public List<Order> all() {
        return this.repository.findAll();
    }
}
