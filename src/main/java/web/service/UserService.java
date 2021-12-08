package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUser(int id);

    void updateUser(User user, int id);

    void saveUser(User user);

    void deleteUser(int id);
}
