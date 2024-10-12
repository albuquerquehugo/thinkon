package com.example.thinkon.users.repository;

import com.example.thinkon.users.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
