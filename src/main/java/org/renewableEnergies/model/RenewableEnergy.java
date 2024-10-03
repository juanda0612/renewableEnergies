package org.renewableEnergies.model;

public record RenewableEnergy(
        String type,
        double production,
        double consumption,
        int year,
        String territory,
        String region
    ) {
}
