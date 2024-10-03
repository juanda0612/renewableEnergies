package org.renewableEnergies.repository;

import org.renewableEnergies.model.User;
import java.util.List;

public interface UserRepository {
    boolean add(User user);
    User login(String userName, String email);
    boolean update();
    List<User> viewData();
}
