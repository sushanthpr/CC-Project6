package com.productService.services;

import com.productService.entities.Product;

import java.util.List;

public interface ProductService {


    Product create(Product product);

    //get all
    List<Product> getAll();

    //get single
    Product get(String id);



    void deleteProduct(String id);



}
