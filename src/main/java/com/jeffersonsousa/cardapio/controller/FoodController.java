package com.jeffersonsousa.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeffersonsousa.cardapio.entity.Food;
import com.jeffersonsousa.cardapio.service.FoodService;

@RestController
@RequestMapping("food")
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	@GetMapping
	public ResponseEntity<List<Food>> getAll(){
		List<Food> listFoods = foodService.getAll();
		return ResponseEntity.ok().body(listFoods);
	}
}
