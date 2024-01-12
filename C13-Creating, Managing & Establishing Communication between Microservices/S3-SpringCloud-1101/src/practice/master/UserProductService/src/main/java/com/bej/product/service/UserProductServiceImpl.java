package com.bej.product.service;

import com.bej.product.domain.User;
import com.bej.product.domain.Product;
import com.bej.product.exception.UserAlreadyExistsException;
import com.bej.product.exception.UserNotFoundException;
import com.bej.product.exception.ProductNotFoundException;
import com.bej.product.repository.UserProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserProductServiceImpl implements IUserProductService {

    // Autowire the UserProductRepository using constructor autowiring

    @Override
    public User registerUser(User user)  {
        // Register a new user
        return null;
    }

    @Override
    public User saveUserProductToList(Product product, String userId) {
        // Save the product to the User
        return null;
    }

    @Override
    public User deleteUserProductFromList(String userId, String productCode)  {
        // Delete a product from the user list
        return null;
    }

    @Override
    public List<Product> getAllUserProductsFromList(String userId) {
        // Get all products from the User list
        return null;

    }




}
