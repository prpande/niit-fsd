package com.eretail.StockApp.service;

import com.eretail.StockApp.model.Product;
import com.eretail.StockApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService{
    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
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
}
