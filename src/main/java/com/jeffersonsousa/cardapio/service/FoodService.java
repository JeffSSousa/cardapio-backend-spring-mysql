package com.jeffersonsousa.cardapio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffersonsousa.cardapio.dto.FoodResponseDTO;
import com.jeffersonsousa.cardapio.repository.FoodRepository;

@Service
public class FoodService {

	@Autowired
	private FoodRepository foodRepository;
	
	public List<FoodResponseDTO> getAll(){
		List<FoodResponseDTO> list = foodRepository.findAll().stream().map(FoodResponseDTO:: new).toList();
		return list;
	}
}
