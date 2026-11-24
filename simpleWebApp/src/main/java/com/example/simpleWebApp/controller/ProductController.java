package com.example.simpleWebApp.controller;


import com.example.simpleWebApp.model.products;
import com.example.simpleWebApp.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductServices services;

    @GetMapping("/products")
    public List<products> getProducts(){
        return services.getProducts();

    }

    @GetMapping("/products/{prodId}")                 // two new things {},@PathVariable
    public products getProductById( @PathVariable int prodId){
        return services.getProductById(prodId);

    }
    @PostMapping("/products")  //RequestBody put the request to the parameter
    public void addProduct(@RequestBody products p){
        System.out.println(p);
        services.addProduct(p);
    }

    @PutMapping ("/products")
    public void updateProduct( @RequestBody products p){
        services.UpdateProduct(p);
    }

    @DeleteMapping("/products/{prodId}")
    public void DeleteProduct(@PathVariable int prodId){
         services.DeleteProduct(prodId);

    }
}
