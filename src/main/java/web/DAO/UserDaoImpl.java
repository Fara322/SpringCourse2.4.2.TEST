package web.DAO;

import org.springframework.stereotype.Repository;
import web.Model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
    List<User> allUsers = entityManager.createQuery("from User", User.class)
            .getResultList();
        return allUsers;
    }

    @Override
    public void saveUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getUser(int id) {
        User user = entityManager.find(User.class, id);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        int isSuccessful = entityManager.createQuery("delete from User " +
                " where id =:userId")
                .setParameter("userId", id)
                .executeUpdate();
    }

    @Override
    public User getUserByName(String name) {
        return entityManager.createQuery(
                        "SELECT user FROM User user WHERE user.name =:name", User.class)
                .setParameter("name", name)
                .getSingleResult();
    }
}
