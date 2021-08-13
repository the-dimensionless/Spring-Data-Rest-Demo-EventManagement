package com.springdatarest.event_management.repositories;

import com.springdatarest.event_management.entities.Venue;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepositoryInterface extends CrudRepository<Venue, Long> {
}
