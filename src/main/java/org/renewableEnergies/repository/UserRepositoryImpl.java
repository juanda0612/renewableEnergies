package org.renewableEnergies.repository;

import org.renewableEnergies.model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{

    ConexionMySQL conexion = new ConexionMySQL();
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet resultSet;

    @Override
    public boolean add(User user) {
        String sql = "INSERT INTO user(name, lastname, username, email, password) VALUES(?, ?, ?, ?, ?)";
        try{
            preparedStatement = conexion.connect().prepareStatement(sql);
            preparedStatement.setString(1, user.firstname());
            preparedStatement.setString(2, user.lastName());
            preparedStatement.setString(3, user.userName());
            preparedStatement.setString(4, user.email());
            preparedStatement.setString(5, user.password());
            return preparedStatement.executeUpdate() > 0;

        } catch(Exception error) {
            System.out.println(error);
        }
        return false;
    }

    @Override
    public User login(String userName, String email) {
        String sql = "SELECT * FROM user WHERE username = ? or email = ?";
        User user;
        System.out.println("iniciando " + userName + email);

        try{
            preparedStatement = conexion.connect().prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, email);
            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                user = new User(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6)
                );
                System.out.println(user);
                return user;
            }

        } catch(Exception error) {
            System.out.println(error);
        }

        return null;
    }

    @Override
    public boolean update() {
        return false;
    }

    @Override
    public List<User> viewData() {
        return null;
    }
}
