package com.productapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productapp.dto.Product;
//spring data : rdbms no-sql
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
	public List<Product> findByPrice(double price);

}
