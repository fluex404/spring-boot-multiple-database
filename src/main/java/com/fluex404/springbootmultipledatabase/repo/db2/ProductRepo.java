package com.fluex404.springbootmultipledatabase.repo.db2;

import com.fluex404.springbootmultipledatabase.entity.db1.User;
import com.fluex404.springbootmultipledatabase.entity.db2.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
