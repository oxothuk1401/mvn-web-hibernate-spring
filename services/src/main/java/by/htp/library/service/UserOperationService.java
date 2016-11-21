package by.htp.library.service;

import by.htp.library.dao.UserOperationDAO;
import by.htp.library.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by oxothuk1401 on 21.11.2016.
 */
@Service
public class UserOperationService {
    @Autowired
    private UserOperationDAO userOperationDAO;

    public String userOperation(String login, String command) {
        boolean result = false;
        switch (command) {
            case "delete": result = userOperationDAO.deleteUser(login);  break;
            case "block": result = userOperationDAO.blockUser(login);  break;
            case "unlock": result = userOperationDAO.unLockUser(login); break;
        }
        if (result == true) {
            return PageName.USER_ADMIN_PAGE;
        }
        return PageName.SHOW_USERS;
    }
}
