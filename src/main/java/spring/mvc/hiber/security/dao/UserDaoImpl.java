package spring.mvc.hiber.security.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.mvc.hiber.security.entity.User;

import javax.transaction.Transactional;
import java.util.List;
import org.hibernate.query.Query;

@Repository
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {

        Session session = sessionFactory.getCurrentSession();
//        List<User> allUsers = session.createQuery("from User", User.class).getResultList();

        Query<User> query = session.createQuery("from User", User.class);
        List<User> allUsers = query.getResultList();
        System.out.println(allUsers);
        return allUsers;
    }
}
