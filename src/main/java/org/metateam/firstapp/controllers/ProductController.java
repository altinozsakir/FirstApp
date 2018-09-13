package org.metateam.firstapp.controllers;

import org.metateam.firstapp.entities.Product;
import org.metateam.firstapp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @RequestMapping("/products/{id}")
    public Product getProduct(@PathVariable String id){
        return productService.getProductById(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/products")
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/products/{id}")
    public void updateProduct(@PathVariable String id,@RequestBody Product product){
        productService.updateProduct(id,product);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/products/{id}")
    public void deleteProduct(@PathVariable String id){
        productService.deleteProduct(id);
    }


}
