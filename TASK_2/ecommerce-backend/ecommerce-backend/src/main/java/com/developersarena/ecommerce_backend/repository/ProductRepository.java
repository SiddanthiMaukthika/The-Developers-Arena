package com.developersarena.ecommerce_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developersarena.ecommerce_backend.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
