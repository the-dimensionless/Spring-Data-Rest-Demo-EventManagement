package com.springdatarest.event_management.repositories;

import com.springdatarest.event_management.entities.Event;
import com.springdatarest.event_management.entities.projections.PartialEventProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import java.time.ZoneId;
import java.util.List;

@RepositoryRestResource(excerptProjection = PartialEventProjection.class)
public interface EventRepositoryInterface extends PagingAndSortingRepository<Event, Long> {

    Page<Event> findByName(@Param("name") String eventName, Pageable pageable); // pass req param as name:value

    Page<Event> findByNameAndZoneId(@Param("name") String eventName, @Param("zoneId") ZoneId zoneId, Pageable pageable);

    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void deleteById(Long id);
}
