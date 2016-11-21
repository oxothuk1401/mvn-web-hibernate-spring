package by.htp.library.dao;

import by.htp.library.dao.exception.DAOException;
import by.htp.library.entity.User;

import java.util.List;

/**
 * Created by oxothuk1401 on 07.10.2016.
 */
public interface UserOperationDAO<T> {

    User checkLogin(String login, String password);

    User checkRegister(String login, String password);

    User deleteUser(String user);

    User blockUser(String user);

    User unLockUser(String user);

    List<User> takeUser(String position, String amount);

    int countAllUsers();
}
