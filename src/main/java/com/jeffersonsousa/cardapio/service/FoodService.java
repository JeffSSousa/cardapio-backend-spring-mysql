package com.jeffersonsousa.cardapio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffersonsousa.cardapio.entity.Food;
import com.jeffersonsousa.cardapio.repository.FoodRepository;

@Service
public class FoodService {

	@Autowired
	private FoodRepository foodRepository;
	
	public List<Food> getAll(){
		List<Food> list = foodRepository.findAll();
		return list;
	}
}
