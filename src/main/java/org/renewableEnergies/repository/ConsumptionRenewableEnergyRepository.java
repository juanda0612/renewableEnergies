package org.renewableEnergies.repository;

import org.renewableEnergies.model.Location;
import org.renewableEnergies.util.CsvReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumptionRenewableEnergyRepository {
    CsvReader csvReader = new CsvReader();
    private List<String[]> consumptionEnergy;
    private List<Location> locations;

    public ConsumptionRenewableEnergyRepository() {
        this.consumptionEnergy =  csvReader.getData("src/main/resources/data/3modern-renewable-prod.csv");
        this.locations = new ArrayList<>();
    }

    public List<Location> getLocations() {
        consumptionEnergy.removeFirst();
        for(String[] location:consumptionEnergy) {
            locations.add(new Location(0,location[0], Integer.parseInt(location[2])));
        }
        return locations;
    }
}
