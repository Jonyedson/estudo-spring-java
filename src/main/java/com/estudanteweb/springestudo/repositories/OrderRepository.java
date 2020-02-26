package com.estudanteweb.springestudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudanteweb.springestudo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
