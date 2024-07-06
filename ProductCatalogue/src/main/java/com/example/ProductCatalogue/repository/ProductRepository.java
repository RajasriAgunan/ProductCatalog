package com.example.ProductCatalogue.repository;


import com.example.ProductCatalogue.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}