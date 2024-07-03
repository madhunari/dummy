package com.admin.service;

import com.admin.Dao.ProductDao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductDao productRepository;

    public int getTotalProducts() {
        return productRepository.countAll();
    }
}
