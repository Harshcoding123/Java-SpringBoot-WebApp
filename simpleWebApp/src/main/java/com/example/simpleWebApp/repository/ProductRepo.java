package com.example.simpleWebApp.repository;

import com.example.simpleWebApp.model.products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//in this we create interface repo which extends class
@Repository
public interface ProductRepo extends JpaRepository<products,Integer> {


}
