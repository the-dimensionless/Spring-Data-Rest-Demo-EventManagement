package com.springdatarest.event_management.repositories;

import com.springdatarest.event_management.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EventRepositoryInterface extends PagingAndSortingRepository<Event, Long> {
}
