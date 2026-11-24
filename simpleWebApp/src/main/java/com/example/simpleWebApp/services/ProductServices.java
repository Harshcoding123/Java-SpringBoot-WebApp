package com.example.simpleWebApp.services;

import com.example.simpleWebApp.model.products;
import com.example.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {
    @Autowired
    ProductRepo repo; //spring is responsible to create the object of this class

//    List<products> product = new ArrayList<>(Arrays.asList(
//            new products(101,"Iphone",50000),
//            new products(102,"Camera",534000),
//            new products(103,"TV",600000)
//
//    ));



    public List<products> getProducts(){
//       return product;
        return repo.findAll();

    }


    public products getProductById(int prodId) {
//        for(int i=0;i<product.size();i++){
//            if(product.get(i).getProdId()==prodId){
//                return product.get(i);
//            }
//        }
//        return null;
       return repo.findById(prodId).orElse(new products());

    }

    public void addProduct(products p){
//        product.add(p);
        repo.save(p);
    }
    public void UpdateProduct(products p){
//        int idx=0;
//        for(int i=0;i<product.size();i++){
//
//         if(product.get(i).getProdId()==p.getProdId()){
//             idx= i;
//             break;
//         }
//        }
//        product.remove(idx);
//        product.add(idx,p);
        repo.save(p);  //id p exist it will update and if not it will add
    }

    public void DeleteProduct(int prodId) {
//        for(int i=0;i<product.size();i++){
//            if(product.get(i).getProdId()==prodId){
//                product.remove(i);
//                break;
//            }
//        }
        repo.deleteById(prodId);
    }
}
