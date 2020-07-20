package com.example.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto.entities.Category;


public interface CategoryRespository extends JpaRepository<Category, Long> {
	
	

}
