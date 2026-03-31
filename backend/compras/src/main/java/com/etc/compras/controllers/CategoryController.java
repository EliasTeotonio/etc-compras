package com.etc.compras.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etc.compras.entities.Category;
import com.etc.compras.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
	
	private final CategoryService service;
	
	public CategoryController(CategoryService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}
}
