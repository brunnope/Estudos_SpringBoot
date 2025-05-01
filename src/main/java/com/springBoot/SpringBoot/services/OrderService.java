package com.springBoot.SpringBoot.services;

import com.springBoot.SpringBoot.entities.Order;
import com.springBoot.SpringBoot.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order>findAll(){
        List<Order> orders = orderRepository.findAll();

        return orders.isEmpty() ? null : orders;

    }

    public Order findById(Long id){
        return orderRepository.findById(id).orElse(null);
    }
}
