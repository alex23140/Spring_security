package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUser(int id);

    void updateUser(User user, int id);

    void saveUser(User user);

    void deleteUser(int id);
}
