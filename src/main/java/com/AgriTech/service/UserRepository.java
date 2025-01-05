package com.AgriTech.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgriTech.dto.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
