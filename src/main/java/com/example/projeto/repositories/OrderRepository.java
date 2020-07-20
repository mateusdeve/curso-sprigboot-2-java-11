package com.example.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {


}
