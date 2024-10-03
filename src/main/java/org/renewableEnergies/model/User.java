package org.renewableEnergies.model;

public record User(
        String id,
        String userType,
        String firstname,
        String lastName,
        String userName,
        String email,
        String password
    ) {
}
