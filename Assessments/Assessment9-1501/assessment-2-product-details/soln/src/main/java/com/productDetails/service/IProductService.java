package com.productDetails.service;

import com.productDetails.domain.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(int id);
    boolean deleteProductById(int id);
    List<Product> getProductByPrice(float productPrice);
    Product updateProduct(Product product, int productId);
}
