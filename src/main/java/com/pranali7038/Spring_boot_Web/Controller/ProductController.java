package com.pranali7038.Spring_boot_Web.Controller;

import com.pranali7038.Spring_boot_Web.Model.Product;
import com.pranali7038.Spring_boot_Web.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

        @Autowired
        ProductService service;

        @GetMapping("/products")
        public List<Product> getProducts(){

            return service.getProduct();
        }

        @GetMapping("/products/{prodId}")
        public Product getProductById(@PathVariable int prodId){
            return service.getProductById(prodId);
        }

        @PostMapping("/products")
        public boolean addProduct(@RequestBody Product prod){
             service.addProduct(prod);
             return true;

        }

        @PutMapping("/products")
        public void updateProduct(@RequestBody Product prod){
            service.updateProduct(prod);
        }

        @DeleteMapping("/products/{prodId}")
        public void deleteProduct(@PathVariable int prodId){
            service.deleteProduct(prodId);
        }

}
