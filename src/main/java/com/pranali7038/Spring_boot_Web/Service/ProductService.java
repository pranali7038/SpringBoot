package com.pranali7038.Spring_boot_Web.Service;

import com.pranali7038.Spring_boot_Web.Model.Product;
import com.pranali7038.Spring_boot_Web.Repository.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    productRepo repo;

//    List<Product>products = new ArrayList<>(Arrays.asList(
//            new Product(101,"iphone",50000),
//            new Product(102,"canon camera",70000),
//            new Product(103,"Mic",10000)));

    public List<Product> getProduct(){

        return repo.findAll();
    }

    public Product getProductById(int prodId){
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }


   public void updateProduct(Product prod){
        repo.save(prod);
   }

   public void deleteProduct(int prodId){
       repo.deleteById(prodId);

   }
}
