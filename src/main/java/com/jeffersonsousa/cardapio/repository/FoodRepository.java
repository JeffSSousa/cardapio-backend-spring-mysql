package com.jeffersonsousa.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jeffersonsousa.cardapio.entity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

}
