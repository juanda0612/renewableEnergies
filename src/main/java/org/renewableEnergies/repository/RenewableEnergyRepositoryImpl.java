package org.renewableEnergies.repository;

import org.renewableEnergies.model.Location;
import org.renewableEnergies.model.RenewableEnergy;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RenewableEnergyRepositoryImpl implements RenewableEnergyRepository{

    ConexionMySQL conexion = new ConexionMySQL();
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    @Override
    public void addBdLocation(List<Location> locations) {
        //String sql = "INSERT INTO location(name, year) VALUES(?, ?)";

        //Location location = new Location(0,"pais imaginario", 2024);

        String sql = "INSERT INTO location(name, year) SELECT ?, ? WHERE NOT EXISTS(SELECT 1 FROM location WHERE name = ? AND year = ?)";

        try{
            preparedStatement = conexion.connect().prepareStatement(sql);

            for(Location location:locations) {
                preparedStatement.setString(1, location.name());
                preparedStatement.setInt(2, location.year());
                preparedStatement.setString(3, location.name());
                preparedStatement.setInt(4, location.year());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    };

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
