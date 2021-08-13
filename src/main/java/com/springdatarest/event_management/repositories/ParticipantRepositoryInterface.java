package com.springdatarest.event_management.repositories;

import com.springdatarest.event_management.entities.Participant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ParticipantRepositoryInterface extends PagingAndSortingRepository<Participant, Long> {
}
