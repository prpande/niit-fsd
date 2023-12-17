package com.niit.productService.repository;

import com.niit.productService.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product, Integer> {
}
