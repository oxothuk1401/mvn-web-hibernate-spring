package by.htp.library.service;

import by.htp.library.dao.UserOperationDAO;
import by.htp.library.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private UserOperationDAO userOperationDAO;


    public String checkLogin(String login, String password) {

        User user = userOperationDAO.checkLogin(login, password);
        if (user==null) {
            return PageName.ERROR_PAGE;
        }
        if (user.getRole().equals(UserStatus.ADMIN)) {
            return PageName.ADMIN_PAGE;
        }
        if (user.getRole().equals(UserStatus.USER) || user.getBlacklist().equals(UserStatus.UNBLOCK)) {
                return PageName.USER_PAGE;
            }

        return PageName.ERROR_PAGE;
    }
}