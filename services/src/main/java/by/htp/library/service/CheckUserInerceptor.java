//package by.htp.library.service;
//
//import by.htp.library.entity.User;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Created by oxothuk1401 on 07.11.2016.
// */
//@Component
//public class CheckUserInerceptor extends HandlerInterceptorAdapter {
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView modelAndView) throws Exception {
//        if(request.getRequestURI().contains("check-user")){
//            User user = (User) modelAndView.getModel().get("user");
//            if(user == null){
//                response.sendRedirect(request.getContextPath() + "/error");
//            }
//        }
//    }
//}
