package com.productService.contoller;

import com.productService.entities.Product;
import com.productService.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {


    @Autowired
    private ProductService productService;


    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(product));
    }


    @GetMapping("/{productId}")
    public ResponseEntity<Product> createProduct(@PathVariable String productId) {
        return ResponseEntity.status(HttpStatus.OK).body(productService.get(productId));
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(productService.getAll());
    }


    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") String productId){
        productService.deleteProduct(productId);
        return new ResponseEntity<>("Product successfully deleted!", HttpStatus.OK);
    }


}
