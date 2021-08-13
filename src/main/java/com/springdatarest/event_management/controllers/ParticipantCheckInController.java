package com.springdatarest.event_management.controllers;

import com.springdatarest.event_management.controllers.exceptions.AlreadyCheckedInException;
import com.springdatarest.event_management.entities.Participant;
import com.springdatarest.event_management.repositories.ParticipantRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@RepositoryRestController
@RequestMapping("/events")
public class ParticipantCheckInController {

    @Autowired
    ParticipantRepositoryInterface participantRepository;

    @PostMapping("/checkIn/{participantId}")
    public ResponseEntity<PersistentEntityResource> checkIn(@PathVariable Long participantId, PersistentEntityResourceAssembler assembler) {
        Optional<Participant> optionalParticipant = participantRepository.findById(participantId);
        if (optionalParticipant.isPresent()) {
            Participant participant = optionalParticipant.get();
            participant.setCheckedIn(true);
            participantRepository.save(participant);

            return ResponseEntity.ok(assembler.toFullResource(participant));
        } else {
            throw new AlreadyCheckedInException();
        }
    }
}
