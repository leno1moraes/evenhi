package com.backend.evenhi.evenhi.controller;


import com.backend.evenhi.evenhi.dto.EventDTO;
import com.backend.evenhi.evenhi.model.Event;
import com.backend.evenhi.evenhi.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/add")
    public String createEvent(@RequestBody EventDTO eventDTO,
                              @AuthenticationPrincipal UserDetails userDetails
                              ){
        eventService.createEvent(eventDTO.getTitle(), eventDTO.getData(), eventDTO.getTypeEvent(), userDetails.getUsername());
        return "Successfully Add!";
    }

    @GetMapping("/list")
    public List<Event> listEvents(){
        return eventService.getListEvent();
    }

    @PutMapping("update/{eventId}")
    public String updateEvent(@PathVariable Long eventId,
                             @RequestBody String title,
                             @RequestBody Date data,
                             @RequestBody String typeEvent,
                             @AuthenticationPrincipal UserDetails userDetails
                             ){
        eventService.updateEvent(eventId, title, data, typeEvent, userDetails.getUsername());
        return "Successfully Update!";
    }

    @DeleteMapping("/delete/{eventId}")
    public String deleteEvent(@PathVariable Long eventId,
                              @RequestBody String title,
                              @RequestBody Date data,
                              @RequestBody String typeEvent,
                              @AuthenticationPrincipal UserDetails userDetails
                            ){
        eventService.updateEvent(eventId, title, data, typeEvent, userDetails.getUsername());
        return "Successfully Delete!";
    }

}
