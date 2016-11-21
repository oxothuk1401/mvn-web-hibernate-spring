package by.htp.library.controller;

import by.htp.library.entity.User;
import by.htp.library.service.PageName;
import by.htp.library.utils.ShowResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * Created by oxothuk1401 on 08.11.2016.
 */
@org.springframework.stereotype.Controller
public class Register {
    @ShowResult
    @RequestMapping(value = "/check-register", method = RequestMethod.POST)
    public String checkRegister(@ModelAttribute User user) {
        return PageName.REGISTER_PAGE;
    }
}
