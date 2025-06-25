package com.example.spring_boot_rest_api.repository;

import com.example.spring_boot_rest_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // find product by category
    List<Product> findProductsByCategory(String name);

    // Find products with price less or eqal to maxprice
    List<Product> findProductsByPriceLessThanEqual(Double maxprice);

    // Find products containing name(case insesitive)
    List<Product> findProductsByNameContainingIgnoreCase(String name);

    Double price(Double price);
}
