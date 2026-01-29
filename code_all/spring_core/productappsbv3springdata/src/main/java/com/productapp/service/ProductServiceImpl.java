package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productapp.dto.Product;
import com.productapp.excetions.FooEx;
import com.productapp.repo.ProductRepo;
import com.productapp.service.aspect.MyLogger;

@Service(value = "ps")
@Transactional
public class ProductServiceImpl implements ProductService {

	private ProductRepo productRepo;

	@Autowired
	public ProductServiceImpl(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}

	@MyLogger
	@Override
	public List<Product> getAllProduct() {
		List<Product> products = productRepo.findAll();
		return products;
	}

	@Override
	public void saveProduct(Product product) throws FooEx {
		productRepo.save(product);
	}

}
