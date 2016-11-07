package by.htp.library.controller;

import by.htp.library.entity.User;
import by.htp.library.service.LoginService;
import by.htp.library.service.PageName;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Locale;
import java.util.Map;


@org.springframework.stereotype.Controller
@SessionAttributes("user")
public class LoginController {
    private static Logger log = Logger.getLogger(LoginController.class);
    @Autowired
    LoginService loginService;

    String page = PageName.INDEX_PAGE;
    @ModelAttribute
    public User createNewUser() {
        return new User();
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(@ModelAttribute User user, HttpSession session, Locale locale) {
        return page;
    }


    @RequestMapping(value = "/check-user", method = RequestMethod.POST)
    public String checkUser(Locale locale, @Valid @ModelAttribute("user") User user, BindingResult bindingResult, ModelMap modelMap, RedirectAttributes redirectAttributes) {
        if (!bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("locale", locale);
                page = loginService.checkLogin(user.getLogin(), user.getPassword());
            System.out.println(5);
            return "redirect:/user_page";
//            }
        }
        System.out.println(6);
        return page;
    }

    @RequestMapping(value = "/user_page", method = RequestMethod.GET)
    public String goMainPage(HttpServletRequest request) {

        Map<String, ?> map = RequestContextUtils.getInputFlashMap(request);
        if (map != null) {
            log.info("redirect!");
        } else {
            log.info("update!");
        }
        System.out.println(7);
        return page;
    }


}