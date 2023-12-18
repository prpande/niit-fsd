package com.eretail.StockApp.service;

import com.eretail.StockApp.model.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(int id);
    boolean deleteProductById(int id);
}
