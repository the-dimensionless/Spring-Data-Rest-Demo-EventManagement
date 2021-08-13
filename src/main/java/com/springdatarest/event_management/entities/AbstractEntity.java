package com.springdatarest.event_management.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.Instant;

@MappedSuperclass
public class AbstractEntity {
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    // Following annotation makes sure we need not get this from the Request (auto generated)
    @JsonIgnore
    @CreationTimestamp
    @Column(updatable = false)
    protected Instant created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }
}
