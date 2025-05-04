package com.springBoot.SpringBoot.services;

import com.springBoot.SpringBoot.entities.Category;
import com.springBoot.SpringBoot.entities.Product;
import com.springBoot.SpringBoot.repositories.CategoryRepository;
import com.springBoot.SpringBoot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product>findAll(){
        List<Product> products = productRepository.findAll();

        return products.isEmpty() ? null : products;

    }

    public Product findById(Long id){
        return productRepository.findById(id).orElse(null);
    }
}
