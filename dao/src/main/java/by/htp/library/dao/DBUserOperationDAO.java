package by.htp.library.dao;

import by.htp.library.dao.exception.DAOException;
import by.htp.library.entity.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.SQLGrammarException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by oxothuk1401 on 07.10.2016.
 */
@Repository
public class DBUserOperationDAO implements UserOperationDAO {
    @Autowired
    SessionFactory sessionFactory;

    public User checkLogin(String login, String password) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("login", login));
        criteria.add(Restrictions.eq("password", MD5.getMD5(password)));
        return (User) criteria.uniqueResult();
    }

    @Override
    public User checkRegister(String login, String password) {
        return null;
    }

    @Override
    public User deleteUser(String user) {
        return null;
    }

    @Override
    public User blockUser(String user) {
        return null;
    }

    @Override
    public User unLockUser(String user) {
        return null;
    }

    @Override
    public List<User> takeUser(String position, String amount) {
        return null;
    }

    @Override
    public int countAllUsers() {
        return 0;
    }
}