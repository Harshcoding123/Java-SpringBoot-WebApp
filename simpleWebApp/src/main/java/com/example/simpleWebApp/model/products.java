package com.example.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity     //product is an entity
public class products {

    @Id   //prodid is priary key
    private int prodId;
    private String ProdName;
    private int price;

    public int getProdId(){
        return prodId;
    }

//    public products(int prodId,String ProdName,int price){
//        this.prodId =prodId;
//        this.ProdName= ProdName;
//        this.price= price;
//    }

}
