package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
    // Spring Data JPA will automatically provide the implementation based on the method name
    List<CartItem> findAllByMemberId(int memberId);
}
