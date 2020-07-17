package com.example.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto.entities.User;
import com.example.projeto.repositories.UserRespository;

@Service
public class UserService {

	@Autowired
	private UserRespository respository;
	
	public List<User> findAll(){
		return respository.findAll();
	}
	
	public User findById(Long id) {
	    Optional<User> obj = respository.findById(id);
	    return obj.get();
	}
}
