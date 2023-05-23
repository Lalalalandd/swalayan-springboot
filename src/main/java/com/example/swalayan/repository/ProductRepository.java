package com.example.swalayan.repository;

import com.example.swalayan.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product, Integer> {
}
