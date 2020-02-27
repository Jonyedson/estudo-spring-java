package com.estudanteweb.springestudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudanteweb.springestudo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
