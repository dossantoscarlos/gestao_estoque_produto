package com.dossantoscarlos.auth.modules.orders;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersResource {

    private final OrdersService orderService;

    public OrdersResource(final OrdersService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getOrder(){
        return this.orderService.all();
    }


}
