package com.example.PerfumePalace.repository;

import com.example.PerfumePalace.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}