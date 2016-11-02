package by.htp.library.controller;

import by.htp.library.entity.Book;
import by.htp.library.service.ShowCatalogService;
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
public class ShowCatalog {
    @Autowired
    ShowCatalogService showCatalogService;
    @RequestMapping(value = "/show-catalog", method = RequestMethod.GET)
    public ModelAndView showCatalog(){
        ModelAndView modelAndView = new ModelAndView();
		List<Book> list = showCatalogService.showBooks();
        modelAndView.addObject("viewBooks", list);
        modelAndView.setViewName("show-catalog");
        return modelAndView;
    }
}