package com.productDetails.service;

import com.productDetails.domain.Product;
import com.productDetails.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService{
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        Optional<Product> foundProduct = productRepository.findById(id);
        if(foundProduct.isEmpty())
        {
            return null;
        }

        return foundProduct.get();
    }

    @Override
    public boolean deleteProductById(int id) {
        productRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Product> getProductByPrice(float productPrice) {
        return productRepository.findByProductPrice(productPrice);
    }
}
