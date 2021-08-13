package com.springdatarest.event_management.repositories;

import com.springdatarest.event_management.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EventRepositoryInterface extends PagingAndSortingRepository<Event, Long> {

    List<Event> findByName(@Param("name") String eventName); // pass req param as name:value
}
