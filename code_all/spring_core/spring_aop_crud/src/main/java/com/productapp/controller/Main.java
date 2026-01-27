package com.productapp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.productapp.config.AppConfig;
import com.productapp.dao.ProductDao;
import com.productapp.dao.ProductDaoArrayListImpl;
import com.productapp.dto.Product;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

public class Main {

	public static void main(String[] args) {
//		ProductDao productDao=new ProductDaoArrayListImpl();
		//ProductService productService=new ProductServiceImpl(productDao);
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductService productService=(ProductService) ctx.getBean("ps");
		List<Product> proList=productService.getAllProduct();
		proList.forEach(p-> System.out.println(p));
	}
}
