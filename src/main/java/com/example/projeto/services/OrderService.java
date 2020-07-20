package com.example.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto.entities.Order;
import com.example.projeto.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository respository;
	
	public List<Order> findAll(){
		return respository.findAll();
	}
	
	public Order findById(Long id) {
	    Optional<Order> obj = respository.findById(id);
	    return obj.get();
	}
}
