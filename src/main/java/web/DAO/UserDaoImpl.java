package web.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.Model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getAllUsers() {
    Session session = sessionFactory.getCurrentSession();
    List<User> allUsers = session.createQuery("from User", User.class)
            .getResultList();
        return allUsers;
    }

    @Override
    public void saveUser(User user) {
       Session session = sessionFactory.getCurrentSession();
       session.saveOrUpdate(user);
    }

    @Override
    public User getUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, id);
        return user;
    }
}
