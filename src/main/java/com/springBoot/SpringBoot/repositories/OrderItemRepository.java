package com.springBoot.SpringBoot.repositories;

import com.springBoot.SpringBoot.entities.Category;
import com.springBoot.SpringBoot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
