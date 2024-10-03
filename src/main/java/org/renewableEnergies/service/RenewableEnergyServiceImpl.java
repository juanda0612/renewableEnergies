package org.renewableEnergies.service;

import org.renewableEnergies.model.Location;
import org.renewableEnergies.model.RenewableEnergy;
import org.renewableEnergies.repository.ConsumptionRenewableEnergyRepository;
import org.renewableEnergies.repository.ProductionRenewableEnergyRepository;
import org.renewableEnergies.repository.RenewableEnergyRepository;
import org.renewableEnergies.repository.RenewableEnergyRepositoryImpl;

import java.util.List;

public class RenewableEnergyServiceImpl implements RenewableEnergyService {

    ConsumptionRenewableEnergyRepository consumption = new ConsumptionRenewableEnergyRepository();
    ProductionRenewableEnergyRepository production = new ProductionRenewableEnergyRepository();
    RenewableEnergyRepository renewableEnergyRepository = new RenewableEnergyRepositoryImpl();

    public void loadData() {
        List<Location> locationListConsumtion = consumption.getLocations();
        List<Location> locationListProduction = production.getLocations();
        
        renewableEnergyRepository.addBdLocation(locationListConsumtion);
        renewableEnergyRepository.addBdLocation(locationListProduction);
    }

    @Override
    public void add(RenewableEnergy renewableEnergy) {

    }

    @Override
    public double getConsumption(String region) {
        return 0;
    }

    @Override
    public double getProduction(String region) {
        return 0;
    }
}
