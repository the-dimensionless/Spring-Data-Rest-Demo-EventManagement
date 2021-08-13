package com.springdatarest.event_management.repositories;

import com.springdatarest.event_management.entities.Venue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VenueRepositoryInterface extends PagingAndSortingRepository<Venue, Long> {
}
