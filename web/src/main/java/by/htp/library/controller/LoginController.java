package by.htp.library.controller;

import by.htp.library.entity.User;
import org.jboss.logging.Logger;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
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

    @ModelAttribute
    public User createNewUser() {
        return new User();
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(@ModelAttribute User user, HttpSession session, Locale locale) {
        return PageName.INDEX_PAGE;
    }


    @RequestMapping(value = "/check-user", method = RequestMethod.POST)
    public String checkUser(Locale locale, @Valid @ModelAttribute("user") User user, BindingResult bindingResult, ModelMap modelMap, RedirectAttributes redirectAttributes) {
        if (!bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("locale", locale);
            return "redirect:/user_page";
        }
        return PageName.INDEX_PAGE;
//        return new ModelAndView("user_page", "user", user);
    }

    @RequestMapping(value = "/user_page", method = RequestMethod.GET)
    public String goMainPage(HttpServletRequest request) {

        Map<String, ?> map = RequestContextUtils.getInputFlashMap(request);
        if (map != null) {
            log.info("redirect!");
        } else {
            log.info("update!");
        }

        return PageName.USER_PAGE;
    }

//    @RequestMapping(value = "/check-register", method = RequestMethod.POST)
//    public String checkRegister(Locale locale, @ModelAttribute User user, HttpSession session) {
//        return PageName.REGISTER_PAGE;
//    }
}