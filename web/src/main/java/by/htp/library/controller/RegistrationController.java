package by.htp.library.controller;

import by.htp.library.dao.exception.DAOException;
import by.htp.library.entity.User;
import by.htp.library.service.LoginService;
import by.htp.library.service.PageName;
import by.htp.library.service.RegisterService;
import by.htp.library.utils.ShowResult;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Locale;
import java.util.Map;


@org.springframework.stereotype.Controller
public class RegistrationController {

    @Autowired
    RegisterService registerService;

    @ShowResult
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView checkUser(@ModelAttribute("user") User user) {
        ModelAndView model = new ModelAndView();
        String page = registerService.checkRegister(user.getLogin(), user.getPassword());
        if (page.equals(PageName.REGISTER_PAGE)) {
            model.addObject("error", "This login is busy!");
            model.setViewName(PageName.REGISTER_PAGE);
            return model;
        }
        model.addObject("error", "You have successfully registered!");
        model.setViewName(PageName.INDEX_PAGE);
        return model;
    }

//    @RequestMapping(value = "/user_page", method = RequestMethod.GET)
//    public String goMainPage(HttpServletRequest request) {
//
//        Map<String, ?> map = RequestContextUtils.getInputFlashMap(request);
//        String method = (map != null) ? "redirect!" : "update!";
//        System.out.println(method);
//        return page;
//    }
//    @RequestMapping(value = "/user_page", method = RequestMethod.GET)
//    public String mainPage() {
//
//        return "user_page";
//
//    }
//
//    @RequestMapping(value = "/admin_page", method = RequestMethod.GET)
//    public String adminPage() {
//
//        return "admin_page";
//
//    }

    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error) {
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid username or password!");
        }
        model.setViewName("index");
        return model;

    }

}