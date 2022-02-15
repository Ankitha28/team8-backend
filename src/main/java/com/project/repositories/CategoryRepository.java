package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.project.entities.Category;

@CrossOrigin("http://localhost:4200")

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
