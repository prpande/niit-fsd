package com.eretail.StockApp.controller;

import com.eretail.StockApp.model.Product;
import com.eretail.StockApp.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    private IProductService productService;

    @Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity getAllProducts(){
        return new ResponseEntity(productService.getAllProducts(), HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity saveProduct(@RequestBody Product product){
        return new ResponseEntity(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity getProductById(@PathVariable int id){
        return new ResponseEntity(productService.getProductById(id), HttpStatus.FOUND);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity deleteProduct(@PathVariable int id){
        return new ResponseEntity(productService.deleteProductById(id), HttpStatus.OK);
    }
}
