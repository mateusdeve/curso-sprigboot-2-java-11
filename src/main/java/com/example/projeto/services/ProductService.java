package com.example.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto.entities.Product;
import com.example.projeto.repositories.ProductRespository;

@Service
public class ProductService {

	@Autowired
	private ProductRespository respository;
	
	public List<Product> findAll(){
		return respository.findAll();
	}
	
	public Product findById(Long id) {
	    Optional<Product> obj = respository.findById(id);
	    return obj.get();
	}
}
