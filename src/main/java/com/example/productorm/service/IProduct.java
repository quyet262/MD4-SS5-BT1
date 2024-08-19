package com.example.productorm.service;

import com.example.productorm.model.Product;

import java.util.List;

public interface IProduct {
    List<Product> findAll();
    Product findById(int id);
    void save(Product product);
    void delete(int id);
    void update(int id ,Product product);

}
