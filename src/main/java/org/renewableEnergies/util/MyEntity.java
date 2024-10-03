package org.renewableEnergies.util;

import java.util.UUID;

public class MyEntity {
    private String id;

    public MyEntity() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }
}
