package com.backend.evenhi.evenhi.service;

import com.backend.evenhi.evenhi.dto.UserDTO;
import com.backend.evenhi.evenhi.model.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);
}
