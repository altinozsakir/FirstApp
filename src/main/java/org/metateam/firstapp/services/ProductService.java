package org.metateam.firstapp.services;

import org.metateam.firstapp.entities.Category;
import org.metateam.firstapp.entities.Product;
import org.metateam.firstapp.repostories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    public Product getProductById(String id){
        Product product;
        product = productRepository.findOne(id);
        return product;
    }

    public void createProduct(Product product){
        productRepository.save(product);
    }

    public void updateProduct(String id,Product product){
        productRepository.save(product);
    }

    public void deleteProduct(String id){
        productRepository.delete(id);
    }

}
