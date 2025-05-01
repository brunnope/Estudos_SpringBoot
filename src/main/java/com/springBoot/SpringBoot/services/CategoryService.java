package com.springBoot.SpringBoot.services;

import com.springBoot.SpringBoot.entities.Category;
import com.springBoot.SpringBoot.entities.Order;
import com.springBoot.SpringBoot.repositories.CategoryRepository;
import com.springBoot.SpringBoot.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category>findAll(){
        List<Category> categories = categoryRepository.findAll();

        return categories.isEmpty() ? null : categories;

    }

    public Category findById(Long id){
        return categoryRepository.findById(id).orElse(null);
    }
}
