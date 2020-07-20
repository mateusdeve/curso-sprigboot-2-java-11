package com.example.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto.entities.Category;
import com.example.projeto.repositories.CategoryRespository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRespository respository;
	
	public List<Category> findAll(){
		return respository.findAll();
	}
	
	public Category findById(Long id) {
	    Optional<Category> obj = respository.findById(id);
	    return obj.get();
	}
}
