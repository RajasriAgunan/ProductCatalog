package com.example.ProductCatalogue.service.impl;


import com.example.ProductCatalogue.entity.Product;
import com.example.ProductCatalogue.repository.ProductRepository;
import com.example.ProductCatalogue.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getProductList() {
        return productRepository.findAll();
    }
}
