package com.springBoot.SpringBoot.repositories;

import com.springBoot.SpringBoot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
