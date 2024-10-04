package com.backend.evenhi.evenhi.repository;

import com.backend.evenhi.evenhi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String username);

    // Added this
    Boolean existsByEmail(String email);
    Boolean existsByUserName(String username);
}