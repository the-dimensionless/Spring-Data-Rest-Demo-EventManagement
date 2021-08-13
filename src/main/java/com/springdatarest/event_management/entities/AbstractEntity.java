package com.springdatarest.event_management.entities;

import java.time.Instant;

public class AbstractEntity {
    protected Long id;
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
