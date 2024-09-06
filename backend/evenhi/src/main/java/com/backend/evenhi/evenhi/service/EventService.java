package com.backend.evenhi.evenhi.service;

import com.backend.evenhi.evenhi.model.Event;
import com.backend.evenhi.evenhi.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EventService implements EventInterface {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event createEvent(String title, Date data, String typeEvent, String ownerUser) {
        Event event = new Event();
        event.setTitle(title);
        event.setData(data);
        event.setTypeEvent(typeEvent);
        event.setOwnerUser(ownerUser);
        return eventRepository.save(event);
    }

    @Override
    public Event updateEvent(Long id, String title, Date data, String typeEvent, String ownerUser) {
        Event event = eventRepository.findById(id).orElseThrow(()
                -> new RuntimeException("Event not found"));
        event.setTitle(title);
        event.setData(data);
        event.setTypeEvent(typeEvent);
        event.setOwnerUser(ownerUser);
        return eventRepository.save(event);
    }

    @Override
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public List<Event> getListEvent() {
        return eventRepository.findAll();
    }
}
