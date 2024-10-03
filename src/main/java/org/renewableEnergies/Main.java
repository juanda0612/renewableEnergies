package org.renewableEnergies;

import org.renewableEnergies.repository.ConsumptionRenewableEnergyRepository;
import org.renewableEnergies.repository.ProductionRenewableEnergyRepository;
import org.renewableEnergies.repository.RenewableEnergyRepository;
import org.renewableEnergies.repository.RenewableEnergyRepositoryImpl;
import org.renewableEnergies.service.RenewableEnergyService;
import org.renewableEnergies.service.RenewableEnergyServiceImpl;
import org.renewableEnergies.service.UserServicesImpl;
import org.renewableEnergies.util.CsvReader;
import org.renewableEnergies.service.UserServices;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running...");
        /*
        ProductionRenewableEnergyRepository productionRenewableEnergyRepository = new ProductionRenewableEnergyRepository();
        productionRenewableEnergyRepository.get();

        ConsumptionRenewableEnergyRepository consumptionRenewableEnergyRepository = new ConsumptionRenewableEnergyRepository();
        System.out.println( consumptionRenewableEnergyRepository.get());


         */

        RenewableEnergyService renewableEnergyService = new RenewableEnergyServiceImpl();
        renewableEnergyService.loadData();
        // usuarios

        UserServices userServices = new UserServicesImpl();
        //System.out.println( userServices.add("Sofia", "Bedoya", "sofi","sofia@mailto.com", "djhsh545" ));
        System.out.println( userServices.login("sofi","","djhsh545" ));
        //System.out.println( userServices.login("","sofia@mailto.com","djhsh545" ));
        //System.out.println( userServices.login("sofi3","","djhsh545" ));
        //System.out.println( userServices.login("","sofia3@mailto.com","djhsh545" ));
        //System.out.println( userServices.login("","sofia@mailto.com","djhsh545" ));

        // (name, lastname, username, email, password)

    }
}