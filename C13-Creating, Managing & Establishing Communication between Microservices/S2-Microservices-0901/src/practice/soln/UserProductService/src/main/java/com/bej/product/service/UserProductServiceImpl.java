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
import java.util.Optional;

@Service
public class UserProductServiceImpl implements IUserProductService {

    // Autowire the UserProductRepository using constructor autowiring
    private UserProductRepository userProductRepository;

    @Autowired
    public UserProductServiceImpl(UserProductRepository userProductRepository) {
        this.userProductRepository = userProductRepository;
    }
    
    @Override
    public User registerUser(User user) throws UserAlreadyExistsException {
        // Register a new user
        if (userProductRepository.findById(user.getUserId()).isPresent()) {
            throw new UserAlreadyExistsException();
        }

        return userProductRepository.save(user);
    }

    @Override
    public User saveUserProductToList(Product product, String userId) throws UserNotFoundException {
        // Save the product to the User
        if (userProductRepository.findById(userId).isEmpty()) {
            throw new UserNotFoundException();
        }

        User foundUser = userProductRepository.findById(userId).get();
        List<Product> productList = foundUser.getProductList();
        productList.add(product);
        foundUser.setProductList(productList);
        return userProductRepository.save(foundUser);
    }

    @Override
    public User deleteUserProductFromList(String userId, String productCode) throws UserNotFoundException, ProductNotFoundException {
        // Delete a product from the user list
        Optional<User> foundUser = userProductRepository.findById(userId);
        if (foundUser.isEmpty()) {
            throw new UserNotFoundException();
        }

        User userObj = foundUser.get();
        List<Product> productList = userObj.getProductList();

        Product foundProduct = null;
        for (Product p : productList) {
            if (p.getProductCode().equals(productCode)) {
                foundProduct = p;
                break;
            }
        }

        if (foundProduct == null) {
            throw new ProductNotFoundException();
        }

        productList.remove(foundProduct);
        userObj.setProductList(productList);
        return userProductRepository.save(userObj);
    }

    @Override
    public List<Product> getAllUserProductsFromList(String userId) throws UserNotFoundException{
        // Get all products from the User list
        Optional<User> foundUser = userProductRepository.findById(userId);
        if (foundUser.isEmpty()) {
            throw new UserNotFoundException();
        }

        User userObj = foundUser.get();
        return userObj.getProductList();

    }
}
