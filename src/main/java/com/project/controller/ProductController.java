package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.Product;
import com.project.service.ProductService;

@RestController
@CrossOrigin("http://localhost:4200") 
@RequestMapping("/products")
public class ProductController {
    
	@Autowired
	ProductService productService;
	
	
	@GetMapping("/list")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> pro = productService.findAllProducts();
		return new ResponseEntity<>(pro, HttpStatus.OK);
	}
	
}
