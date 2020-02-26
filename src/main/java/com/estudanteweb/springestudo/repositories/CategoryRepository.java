package com.estudanteweb.springestudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudanteweb.springestudo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
