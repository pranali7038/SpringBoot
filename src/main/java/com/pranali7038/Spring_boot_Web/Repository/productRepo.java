package com.pranali7038.Spring_boot_Web.Repository;

import com.pranali7038.Spring_boot_Web.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo  extends JpaRepository<Product,Integer> {

}
