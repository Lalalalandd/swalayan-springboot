package com.example.swalayan.controller;

import com.example.swalayan.model.Product;
import com.example.swalayan.repository.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/swalayan")
    public List<Product> listOfProduct() {
        return productService.getProducts();
    }

    @PostMapping("/createswalayan")
    public ResponseEntity<Product> listOfProducts(@RequestBody Product product) {
        int newProductId = productService.createProduct(product);
        URI productURI = URI.create("/products/" + newProductId);
        return ResponseEntity.created(productURI).build();
    }
}
