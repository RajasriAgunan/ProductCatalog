package com.example.ProductCatalogue.service;


import com.example.ProductCatalogue.entity.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    List<Product> getProductList();

}
