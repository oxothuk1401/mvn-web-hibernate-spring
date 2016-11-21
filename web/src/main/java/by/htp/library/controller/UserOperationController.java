package by.htp.library.controller;

import by.htp.library.entity.User;
import by.htp.library.service.PageName;
import by.htp.library.service.RegisterService;
import by.htp.library.service.UserOperationService;
import by.htp.library.utils.ShowResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by oxothuk1401 on 21.11.2016.
 */
@Controller
public class UserOperationController {

    @Autowired
    UserOperationService userOperationService;

    @ShowResult
    @RequestMapping(value = "/userOperation", method = RequestMethod.GET)
    public ModelAndView userOperation(@ModelAttribute("user") User user) {
        ModelAndView model = new ModelAndView();
        String page = userOperationService.userOperation(user.getLogin(), user.getCommand());
        model.setViewName(PageName.USER_ADMIN_PAGE);
        if (page.equals(PageName.USER_ADMIN_PAGE)) {
            model.addObject("error", "Command " + user.getCommand() + " successful");
            return model;
        }
        model.addObject("error", "ERROR " + user.getCommand());
        return model;
    }

}
