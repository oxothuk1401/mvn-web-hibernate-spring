package by.htp.library.controller;

import by.htp.library.entity.User;
import by.htp.library.service.PageName;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * Created by oxothuk1401 on 08.11.2016.
 */
@org.springframework.stereotype.Controller
public class ToMain {

    @RequestMapping(value = "/to-main", method = RequestMethod.GET)
    public String checkRegister(Locale locale, @ModelAttribute User user, HttpSession session) {

        return PageName.INDEX_PAGE;
    }
}
