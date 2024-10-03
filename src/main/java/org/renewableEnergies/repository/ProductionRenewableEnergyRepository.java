package org.renewableEnergies.repository;

import org.renewableEnergies.model.Location;
import org.renewableEnergies.util.CsvReader;

import java.util.ArrayList;
import java.util.List;

public class ProductionRenewableEnergyRepository {
    CsvReader csvReader = new CsvReader();
    private List<String[]> productionEnergy;
    private List<Location> locations;

    public ProductionRenewableEnergyRepository() {
        this.productionEnergy = csvReader.getData("src/main/resources/data/2modern-renewable-energy-consumption.csv");
        this.locations = new ArrayList<>();
    }

    public List<Location> getLocations() {
        productionEnergy.removeFirst();
        for(String[] location:productionEnergy) {
            locations.add(new Location(0, location[0], Integer.parseInt(location[2])));
        }
        return locations;
    }
}
