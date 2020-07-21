package com.example.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto.entities.OrderItem;


public interface OrderItemRespository extends JpaRepository<OrderItem, Long> {
	
	

}
