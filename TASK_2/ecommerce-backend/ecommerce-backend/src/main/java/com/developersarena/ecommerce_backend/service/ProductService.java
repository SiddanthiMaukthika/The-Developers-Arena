package com.developersarena.ecommerce_backend.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.developersarena.ecommerce_backend.model.Product;
import com.developersarena.ecommerce_backend.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
