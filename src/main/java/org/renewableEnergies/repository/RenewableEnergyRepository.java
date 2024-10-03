package org.renewableEnergies.repository;

import org.renewableEnergies.model.Location;
import org.renewableEnergies.model.RenewableEnergy;

import java.util.List;

public interface RenewableEnergyRepository {
    void addBdLocation(List<Location> locations);
    void add(RenewableEnergy renewableEnergy);
    double getConsumption(String region);
    double getProduction(String region);
}
