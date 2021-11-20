package web.DAO;

import web.Model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    void deleteUser(int id);

    User getUserByName(String name);
}
