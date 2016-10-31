package by.htp.library.controller;

import by.htp.library.entity.User;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Locale;


@org.springframework.stereotype.Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(@ModelAttribute User user, HttpSession session, Locale locale) {
        return "login";
    }


    @RequestMapping(value = "/check-user", method = RequestMethod.POST)
    public String checkUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return PageName.INDEX_PAGE;
        }
        model.addAttribute("user", user);
        return PageName.USER_PAGE;
//        return new ModelAndView("user_page", "user", user);
    }
    @RequestMapping(value = "/check-register", method = RequestMethod.POST)
    public String checkRegister(@ModelAttribute User user, HttpSession session, Locale local) {
        return PageName.REGISTER_PAGE;
    }
}