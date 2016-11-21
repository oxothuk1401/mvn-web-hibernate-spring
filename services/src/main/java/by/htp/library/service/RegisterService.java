package by.htp.library.service;

import by.htp.library.dao.UserOperationDAO;
import by.htp.library.dao.exception.DAOException;
import by.htp.library.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    @Autowired
    private UserOperationDAO userOperationDAO;


    public String checkRegister(String login, String password) {
        User user = userOperationDAO.checkRegister(login, password);
        if (user == null){
            return PageName.REGISTER_PAGE;
        }
        return PageName.INDEX_PAGE;
    }
}