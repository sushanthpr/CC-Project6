package com.productService.services.impl;

import com.productService.entities.Product;
import com.productService.entities.repositories.ProductRepository;
import com.productService.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        String productId = UUID.randomUUID().toString();
        product.setId(productId);


        return productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product get(String productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        return optionalProduct.get();
    }


    @Override
    public void deleteProduct(String Id) {
        productRepository.deleteById(Id);
    }
}

