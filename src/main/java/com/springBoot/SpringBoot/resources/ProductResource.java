package com.springBoot.SpringBoot.resources;

import com.springBoot.SpringBoot.entities.Category;
import com.springBoot.SpringBoot.entities.Product;
import com.springBoot.SpringBoot.services.CategoryService;
import com.springBoot.SpringBoot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping({"", "/"})
    public ResponseEntity<List<Product>> findAll(){
        return ResponseEntity.ok().body(productService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(productService.findById(id));
    }
}
