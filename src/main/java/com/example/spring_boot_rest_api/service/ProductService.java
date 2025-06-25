package com.example.spring_boot_rest_api.service;

import com.example.spring_boot_rest_api.model.Product;
import com.example.spring_boot_rest_api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // get all the product
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    // get product by id
    public Optional<Product> getProductsById(Long id) {
        return productRepository.findById(id);
    }

    // Get products by category
    public List<Product> getProductsByCategory(String categoryName) {
        return productRepository.findProductsByCategory(categoryName);
    }

    public List<Product> getProductsByPriceLessThanEqual(Double price) {
        return productRepository.findProductsByPriceLessThanEqual(price);
    }

    public List<Product> getProductsByProductName(String name) {
        return productRepository.findProductsByNameContainingIgnoreCase(name);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

}
