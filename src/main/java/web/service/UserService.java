package web.service;

import web.model.Role;
import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUser(int id);

    void updateUser(User user, int id);

    void saveUser(User user);

    void deleteUser(int id);

    User getUserByName(String name);

    Role getRoleByName(String name);

    void addRole(Role role);

}
