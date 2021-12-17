package web.dao;

import org.springframework.security.core.userdetails.UserDetails;
import web.model.Role;
import web.model.User;
import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUser(int id);

    void updateUserById(User user, int id);

    void saveUser(User user);

    void deleteUser(int id);

    UserDetails getUserByName(String s);

    Role getRoleByName(String name);

    void addRole(Role role);

}
