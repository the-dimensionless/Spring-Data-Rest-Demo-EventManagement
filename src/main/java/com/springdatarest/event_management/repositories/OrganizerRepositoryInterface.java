package com.springdatarest.event_management.repositories;

import com.springdatarest.event_management.entities.Organizer;
import org.springframework.data.repository.CrudRepository;

public interface OrganizerRepositoryInterface extends CrudRepository<Organizer, Long> {
}
