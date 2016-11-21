package by.htp.library.controller;

import by.htp.library.service.PageName;
import by.htp.library.utils.ShowResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller

public class LoginBySecurity {
    @ShowResult
    @RequestMapping(value = PageName.USER_ADMIN_PAGE, method = RequestMethod.GET)
    public String userAndAdminPage() {
        return PageName.USER_ADMIN_PAGE;

    }
    @ShowResult
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error) {
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid username or password!");
        }
        model.setViewName(PageName.INDEX_PAGE);
        return model;
    }
}
