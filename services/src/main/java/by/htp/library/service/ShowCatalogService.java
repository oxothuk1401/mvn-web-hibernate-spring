package by.htp.library.service;

import by.htp.library.dao.DBBookOperationDAO;
import by.htp.library.entity.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public  class ShowCatalogService {
    @Autowired
    private DBBookOperationDAO dbBookOperationDAO;
    @Autowired
    private SessionFactory sessionFactory;

    public  List<Book> showBooks(){
        List<Book> result = sessionFactory.getCurrentSession().createQuery("from Book").list();
//        List<Book> result = dbBookOperationDAO.getBooks();
        return result;
    }
}