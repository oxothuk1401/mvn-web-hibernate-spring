package by.htp.library.service;

import by.htp.library.dao.DBUserOperationDAO;
import by.htp.library.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowUserService {
    @Autowired
    private DBUserOperationDAO dbUserOperationDAO;

    public List<User> showUsers() {
        List<User> result = dbUserOperationDAO.takeUser();
        return result;
    }
}
