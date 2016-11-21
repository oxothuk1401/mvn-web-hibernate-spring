package by.htp.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginBySecurity {


    @RequestMapping(value = "/user_page", method = RequestMethod.GET)
    public String mainPage() {
        return "user_page";

    }

    @RequestMapping(value = "/admin_page", method = RequestMethod.GET)
    public String adminPage() {
        return "admin_page";

    }

    @RequestMapping(value = "/userAndAdmin_page", method = RequestMethod.GET)
    public String userAndAdminPage() {
        return "userAndAdmin_page";

    }

    @RequestMapping(value = { "/", "/index2" }, method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error) {
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid username or password!");
        }
        model.setViewName("index2");
        return model;

    }

}
