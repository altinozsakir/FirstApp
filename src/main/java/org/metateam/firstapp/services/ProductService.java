package org.metateam.firstapp.services;

import org.metateam.firstapp.entities.Category;
import org.metateam.firstapp.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product("1","car","50000",null),
            new Product("2","brush","20",null),
            new Product("3","home","800000",null)
    ));

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProductById(String id){
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    public void createProduct(Product product){
        products.add(product);
    }
}
