package by.htp.library.controller;

import by.htp.library.entity.Book;
import by.htp.library.entity.User;
import by.htp.library.service.PageName;
import by.htp.library.service.ShowCatalogService;
import by.htp.library.service.ShowUserService;
import by.htp.library.utils.ShowResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by oxothuk1401 on 02.11.2016.
 */
@Controller
public class ShowUsers {
    @Autowired
    ShowUserService showUserService;

    @ShowResult
    @RequestMapping(value = "/show-users", method = RequestMethod.POST)
    public ModelAndView showCatalog(){
        ModelAndView modelAndView = new ModelAndView();
        List<User> list = showUserService.showUsers();
        modelAndView.addObject("viewUsers", list);
        modelAndView.setViewName("/show-users");
        return modelAndView;
    }
}
