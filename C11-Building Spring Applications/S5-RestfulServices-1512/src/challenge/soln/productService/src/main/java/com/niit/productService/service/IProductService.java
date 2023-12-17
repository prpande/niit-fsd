package com.niit.productService.service;

import com.niit.productService.domain.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
}
