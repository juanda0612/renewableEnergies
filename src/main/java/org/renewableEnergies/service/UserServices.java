package org.renewableEnergies.service;

import org.renewableEnergies.model.User;
import java.util.List;

public interface UserServices {
    boolean add(String name, String lastname, String userName, String email, String password);
    boolean login(String userName, String email, String password);
    boolean update();
    List<User> viewData();
}
