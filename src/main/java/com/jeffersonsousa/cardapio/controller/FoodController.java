package com.jeffersonsousa.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeffersonsousa.cardapio.dto.FoodRequestDTO;
import com.jeffersonsousa.cardapio.dto.FoodResponseDTO;
import com.jeffersonsousa.cardapio.service.FoodService;

@RestController
@RequestMapping("food")
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	@PostMapping
	public ResponseEntity<Void> saveFood(@RequestBody FoodRequestDTO data){
		foodService.save(data);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping
	public ResponseEntity<List<FoodResponseDTO>> getAll(){
		List<FoodResponseDTO> listFoods = foodService.getAll();
		return ResponseEntity.ok().body(listFoods);
	}
}
