package by.htp.library.utils;

import by.htp.library.entity.User;
import by.htp.library.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@SessionAttributes("user")
@org.springframework.stereotype.Controller
public class StrengthPassword {

    private static final int WEAK_STRENGTH = 1;
    private static final int FEAR_STRENGTH = 5;
    private static final int STRONG_STRENGTH = 7;

    private static final String WEAK_COLOR = "#FF0000";
    private static final String FEAR_COLOR = "#FF9900";
    private static final String STRONG_COLOR = "#0BFF0C";

    @ModelAttribute
    public User createNewUser() {
        return new User("usernamevalue");
    }
    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/checkStrength", method = RequestMethod.GET, produces = { "text/html; charset=UTF-8" })
    public @ResponseBody
    String checkStrength(@RequestParam String login) {
            return loginService.checkLogin(login);
//        String result = "<span style=\"color:%s; font-weight:bold;\">%s</span>";
//
//        if (password.length() >= WEAK_STRENGTH & password.length() < FEAR_STRENGTH) {
//            return String.format(result, WEAK_COLOR, "Слабый");
//        } else if (password.length() >= FEAR_STRENGTH & password.length() < STRONG_STRENGTH) {
//            return String.format(result, FEAR_COLOR, "Средний");
//        } else if (password.length() >= STRONG_STRENGTH) {
//            return String.format(result, STRONG_COLOR, "Сильный");
//        }
//        return "";
    }
}
