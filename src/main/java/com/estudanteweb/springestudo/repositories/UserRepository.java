package com.estudanteweb.springestudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudanteweb.springestudo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
