package com.backend.evenhi.evenhi.repository;

import com.backend.evenhi.evenhi.model.AppRole;
import com.backend.evenhi.evenhi.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}
