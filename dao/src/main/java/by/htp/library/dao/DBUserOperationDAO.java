//package by.htp.library.dao;
//
//import by.htp.library.dao.exception.DAOException;
//import by.htp.library.entity.Book;
//import by.htp.library.entity.User;
//import org.hibernate.Criteria;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.criterion.Restrictions;
//import org.hibernate.exception.SQLGrammarException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
///**
// * Created by oxothuk1401 on 07.10.2016.
// */
//@Repository
//public class DBUserOperationDAO implements UserOperationDAO {
//    @Autowired
//    SessionFactory sessionFactory;
//
//
//    public User checkLogin(String login) {
//        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
//        criteria.add(Restrictions.eq("login", login));
//        System.out.println(criteria.add(Restrictions.eq("login", login)));
//        return (User) criteria.add(Restrictions.eq("login", login));
//    }
//
//    @Override
//    public User checkRegister(String login, String password) {
//        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
//        criteria.add(Restrictions.eq("login", login));
//        if (criteria.uniqueResult() != null) {
//            return null;
//        }
//        User user = new User();
//        user.setLogin(login);
//        user.setPassword(MD5.getMD5(password));
//        user.setRole("user");
//        user.setBlacklist("unblock");
//        sessionFactory.getCurrentSession().saveOrUpdate(user);
//        return user;
//    }
//
//    @Override
//    public boolean deleteUser(String login) {
//        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
//        criteria.add(Restrictions.eq("login", login));
//        if (criteria.uniqueResult() == null){
//            return false;
//        }
//        User user = new User();
//        user = (User) criteria.uniqueResult();
//        sessionFactory.getCurrentSession().delete(user);
//        return true;
//    }
//
//    @Override
//    public boolean blockUser(String login) {
//        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
//        criteria.add(Restrictions.eq("login", login));
//        if (criteria.uniqueResult() == null){
//            return false;
//        }
//        User user = new User();
//        user = (User) criteria.uniqueResult();
//        user.setBlacklist("block");
//        sessionFactory.getCurrentSession().saveOrUpdate(user);
//        return true;
//    }
//
//    @Override
//        public boolean unLockUser(String login) {
//        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
//        criteria.add(Restrictions.eq("login", login));
//        if (criteria.uniqueResult() == null){
//            return false;
//        }
//        User user = new User();
//        user = (User) criteria.uniqueResult();
//        user.setBlacklist("unblock");
//        sessionFactory.getCurrentSession().saveOrUpdate(user);
//        return true;
//    }
//
//    @Override
//    public List<User> takeUser() {
//        List<User> result = sessionFactory.getCurrentSession().createQuery("from User").list();
//        return result;
//
//    }
//
//    @Override
//    public int countAllUsers() {
//        return 0;
//    }
//}