package com.workshop.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.springboot.entities.OrderItem;
import com.workshop.springboot.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
