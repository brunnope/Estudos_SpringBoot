package com.springBoot.SpringBoot.repositories;

import com.springBoot.SpringBoot.entities.Category;
import com.springBoot.SpringBoot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
