package com.backend.evenhi.evenhi.repository;

import com.backend.evenhi.evenhi.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
