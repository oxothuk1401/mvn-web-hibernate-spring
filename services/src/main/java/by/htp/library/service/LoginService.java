package by.htp.library.service;


import by.htp.library.entity.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public  class LoginService implements UserDetailsService{

    @Autowired
    SessionFactory sessionFactory;

    LoginService(){}


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Query query = sessionFactory.getCurrentSession().createQuery("From User u  where u.login=:username");
        query.setParameter("username", username);
        User resault = (User) query.uniqueResult();
        return resault;
    }
}
