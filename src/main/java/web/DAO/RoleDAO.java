package web.DAO;

import web.Model.Role;
import web.Model.User;

import java.util.List;

public interface RoleDAO {

    List<User> getListRole();

    void add(Role role);

    void update(Role role);

    Role getById(int id);

    Role getByName(String roleName);
}
