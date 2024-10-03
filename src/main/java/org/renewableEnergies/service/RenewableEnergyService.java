package org.renewableEnergies.service;

import org.renewableEnergies.model.RenewableEnergy;

public interface RenewableEnergyService {
    void loadData();
    void add(RenewableEnergy renewableEnergy);
    double getConsumption(String region);
    double getProduction(String region);
}
