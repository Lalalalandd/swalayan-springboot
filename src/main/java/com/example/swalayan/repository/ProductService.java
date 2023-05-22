package com.example.swalayan.repository;

import com.example.swalayan.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductService {
    List<Product> listOfProduct = new ArrayList();
    public List<Product> getProducts(){


        Product product1 = new Product();
        product1.setId(0);
        product1.setName("Sabun Mandi");
        product1.setDesc("Membuatmu bersih bening seperti tanpa kaca");
        product1.setWeight(250);

        listOfProduct.add(product1);

        Product product2 = new Product();
        product2.setId(0);
        product2.setName("Sabun Wajah");
        product2.setDesc("Membuatmu bersih bening seperti tanpa muka");
        product2.setWeight(250);

        listOfProduct.add(product2);

        return listOfProduct;
    }

    public  int createProduct(Product product){
        int nextId = 0;
        for (Product prod: listOfProduct) {
            if (prod.getId() > nextId){
                nextId = prod.getId();
            }
        }
        nextId++;

        product.setId(nextId);
        listOfProduct.add(product);

        return product.getId();
    }
}
