package by.htp.library.dao;

import by.htp.library.entity.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DBBookOperationDAO implements BookOperationDAO {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Book> checkSearch(String searching, String command, String sorted) {
        return null;
    }

    @Override
    public List<Book> getBooks() {
        List<Book> result = sessionFactory.getCurrentSession().createQuery("from Book").list();
        return result;
    }
}
