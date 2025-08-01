package com.jeffersonsousa.cardapio.entity;

import java.util.Objects;

import com.jeffersonsousa.cardapio.dto.FoodRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "foods")
@Entity(name = "foods")
public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String image;
	private Integer price;
	
	public Food(FoodRequestDTO dto) {
		this.title = dto.title();
		this.image = dto.image();
		this.price = dto.price();
	}
	
	public Food() {
	}

	public Food(Long id, String title, String image, Integer price) {
		this.id = id;
		this.title = title;
		this.image = image;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImage() {
		return image;
	}

	public Integer getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
