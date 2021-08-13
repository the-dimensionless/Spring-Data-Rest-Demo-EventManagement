package com.springdatarest.event_management.controllers;

import com.springdatarest.event_management.entities.Event;
import com.springdatarest.event_management.repositories.EventRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@RepositoryRestController
@RequestMapping("/events")
public class EventStartController {

    @Autowired
    private EventRepositoryInterface eventRepository;

    @PostMapping("/start/{eventId}")
    public ResponseEntity start(@PathVariable Long eventId) {
        Optional<Event> optionalEvent = eventRepository.findById(eventId);
        if (optionalEvent.isPresent()) {
            Event event = optionalEvent.get();
            event.setStarted(true);
            eventRepository.save(event);
            return ResponseEntity.ok(event.getName()+" has started!");
        } else {
            throw new ResourceNotFoundException();
        }
    }
}
