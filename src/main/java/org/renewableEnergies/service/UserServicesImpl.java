package org.renewableEnergies.service;

import org.renewableEnergies.model.User;
import org.renewableEnergies.repository.UserRepository;
import org.renewableEnergies.repository.UserRepositoryImpl;
import org.renewableEnergies.util.MyEntity;

import java.util.List;

public class UserServicesImpl implements UserServices{

    private UserRepository userRepository;

    public UserServicesImpl() {
        this.userRepository = new UserRepositoryImpl();
    }

    @Override
    public boolean add(String firstname, String lastname, String userName, String email, String password) {
        return this.userRepository.add(
                new User(
                        new MyEntity().getId(),
                        "basic",
                        firstname.toLowerCase(),
                        lastname.toLowerCase(),
                        userName.toLowerCase(),
                        email.toLowerCase(),
                        password
                )
        );
    }

    @Override
    public boolean login(String userName, String email, String password) {
        User user = this.userRepository.login(userName.toLowerCase(), email.toLowerCase());

        if(!user.userName().isEmpty() && user.password().equals(password)) {
            return true;
        }
        return false;
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
