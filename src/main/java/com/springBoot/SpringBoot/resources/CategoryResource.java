package com.springBoot.SpringBoot.resources;

import com.springBoot.SpringBoot.entities.Category;
import com.springBoot.SpringBoot.entities.Order;
import com.springBoot.SpringBoot.repositories.CategoryRepository;
import com.springBoot.SpringBoot.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @GetMapping({"", "/"})
    public ResponseEntity<List<Category>> findAll(){
        return ResponseEntity.ok().body(categoryService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(categoryService.findById(id));
    }
}
