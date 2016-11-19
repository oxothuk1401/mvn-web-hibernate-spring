package by.htp.library.service;

import by.htp.library.dao.DBBookOperationDAO;
import by.htp.library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public  class ShowCatalogService {
    @Autowired
    private DBBookOperationDAO dbBookOperationDAO;

    public  List<Book> showBooks(){
        List<Book> result = dbBookOperationDAO.getBooks();
        return result;
    }
}
