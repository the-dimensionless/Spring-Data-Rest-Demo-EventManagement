package com.springdatarest.event_management.repositories;

import com.springdatarest.event_management.entities.Participant;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepositoryInterface extends CrudRepository<Participant, Long> {
}
