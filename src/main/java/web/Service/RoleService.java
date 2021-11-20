package web.Service;

import web.Model.Role;
import web.Model.User;

import java.util.List;

public interface RoleService {


    List<User> getListRole();

    void add(Role role);

    void update(Role role);

    Role getById(int id);

    Role getByName(String roleName);
}
