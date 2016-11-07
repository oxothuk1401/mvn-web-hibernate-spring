package by.htp.library.dao;

import by.htp.library.dao.exception.DAOException;
import by.htp.library.entity.User;
import org.apache.log4j.Logger;
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
    public User checkLogin(String login, String password){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("login", login));
        criteria.add(Restrictions.eq("password", MD5.getMD5(password)));
        return (User) criteria.uniqueResult();
    }

    @Override
    public User checkRegister(String login, String password) throws DAOException {
        return null;
    }

    @Override
    public User deleteUser(String user) throws DAOException {
        return null;
    }

    @Override
    public User blockUser(String user) throws DAOException {
        return null;
    }

    @Override
    public User unLockUser(String user) throws DAOException {
        return null;
    }

    @Override
    public List<User> takeUser(String position, String amount) throws DAOException {
        return null;
    }

    @Override
    public int countAllUsers() throws DAOException {
        return 0;
    }

//    @Override
//    public User checkRegister(String login, String password) throws DAOException {
//        Session session = HibernateUtil.getSession();
//        Criteria criteria = session.createCriteria(getPersistentClass());
//        criteria.add(Restrictions.eq("login", login));
//        if (criteria.uniqueResult() != null) {
//            throw new DAOException();
//        } else {
//            User user = new User();
//            user.setLogin(login);
//            user.setPassword(MD5.getMD5(password));
//            user.setRole("user");
//            user.setBlacklist("unblock");
//            add(user);
//            return user;
//        }
//    }
//
//    @Override
//    public User deleteUser(String userLogin) throws DAOException {
//        try {
//            Session session = HibernateUtil.getSession();
//            Criteria criteria = session.createCriteria(getPersistentClass());
//            criteria.add(Restrictions.eq("login", userLogin));
//            User user = new User();
//            user = (User) criteria.uniqueResult();
//            delete(user);
//            return user;
//        } catch (SQLGrammarException e) {
//            throw new DAOException();
//        }
//    }
//
//    @Override
//    public User blockUser(String userLogin) throws DAOException {
//        try {
//            Session session = HibernateUtil.getSession();
//            Criteria criteria = session.createCriteria(getPersistentClass());
//            criteria.add(Restrictions.eq("login", userLogin));
//            User user = new User();
//            user = (User) criteria.uniqueResult();
//            user.setBlacklist("block");
//            update(user);
//            return user;
//        } catch (SQLGrammarException e) {
//            throw new DAOException();
//        }
//    }
//
//    @Override
//    public User unLockUser(String userLogin) throws DAOException {
//        try {
//            Session session = HibernateUtil.getSession();
//            Criteria criteria = session.createCriteria(getPersistentClass());
//            criteria.add(Restrictions.eq("login", userLogin));
//            User user = new User();
//            user = (User) criteria.uniqueResult();
//            user.setBlacklist("unblock");
//            update(user);
//            return user;
//        } catch (SQLGrammarException e) {
//            throw new DAOException();
//        }
//    }
//
//    public List<User> takeUser(String position, String amount) throws DAOException {
//        try {
//            Session session = HibernateUtil.getSession();
//            Criteria criteria = session.createCriteria(getPersistentClass());
//            criteria.setFirstResult(Integer.valueOf(position));
//            criteria.setMaxResults(Integer.valueOf(amount));
//            List<User> listUsers = criteria.list();
//            if (listUsers == null) {
//                throw new DAOException("List of users is empty");
//            }
//            return listUsers;
//        } catch (Exception e) {
//            throw new DAOException("Error accessing database");
//        }
//    }
//
//    public int countAllUsers() throws DAOException {
//        Session session = HibernateUtil.getSession();
//        Criteria criteria = session.createCriteria(getPersistentClass());
//        List<User> userList = criteria.list();
//        int countAllUsers = userList.size();
//        return countAllUsers;
//    }
//
//    @Override
//    public Class getPersistentClass() {
//        return User.class;
//    }
}
