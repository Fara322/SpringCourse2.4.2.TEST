package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.RoleDaoImpl;
import web.Model.Role;
import web.Model.User;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    RoleDaoImpl roleDao;

    @Override
    public List<User> getListRole() {
        return roleDao.getListRole();
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public void update(Role role) {
        roleDao.update(role);
    }

    @Override
    public Role getById(int id) {
        return roleDao.getById(id);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(roleName);
    }
}
