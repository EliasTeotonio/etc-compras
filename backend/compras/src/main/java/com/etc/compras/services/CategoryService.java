package com.etc.compras.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.etc.compras.entities.Category;
import com.etc.compras.repositories.CategoryRepository;

@Service
public class CategoryService {

	private final CategoryRepository repo;
	
	public CategoryService(CategoryRepository repo) {
		this.repo = repo;
	}
	
	public List<Category> findAll() {
		return repo.findAll();
	}
}
