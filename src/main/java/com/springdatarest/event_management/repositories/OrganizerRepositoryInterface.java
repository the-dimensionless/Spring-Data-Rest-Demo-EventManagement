package com.springdatarest.event_management.repositories;

import com.springdatarest.event_management.entities.Organizer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrganizerRepositoryInterface extends PagingAndSortingRepository<Organizer, Long> {
}
