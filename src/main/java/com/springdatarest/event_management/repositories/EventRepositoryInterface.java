package com.springdatarest.event_management.repositories;

import com.springdatarest.event_management.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepositoryInterface extends CrudRepository<Event, Long> {
}
