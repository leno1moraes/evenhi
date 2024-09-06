package com.backend.evenhi.evenhi.service;

import java.util.Date;
import java.util.List;

import com.backend.evenhi.evenhi.model.Event;

public interface EventInterface {
    Event createEvent(String title, Date data, String typeEvent, String ownerUser);

    Event updateEvent(Long id, String title, Date data, String typeEvent, String ownerUser);

    void deleteEvent(Long id);

    List<Event> getListEvent();
}
