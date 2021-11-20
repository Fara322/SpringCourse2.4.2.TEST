package web.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.Model.Role;
import web.Model.User;
import web.Service.RoleService;

import web.Service.UserService;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class ConstructorUser {


    @Autowired
    RoleService roleService;

    @Autowired
    UserService userService;

    @PostConstruct
    void create() {
        Role role = new Role("ROLE_ADMIN");
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        roleService.add(role);
        User user = new User("admin", "admin", "SE", roles);

        role = new Role("ROLE_USER");
        roles = new HashSet<>();
        roleService.add(role);
        user = new User("user", "user", "Employee", roles);

    }
}
