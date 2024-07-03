package com.admin.Dao;

import com.admin.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	@Query("SELECT COUNT(p) FROM Product p")
    int countAll();
}
