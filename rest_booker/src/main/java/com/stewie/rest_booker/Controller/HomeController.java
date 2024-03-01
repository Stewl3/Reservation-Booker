package com.stewie.rest_booker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping(value = {"/"})
public class HomeController {
    
    @GetMapping
    public ModelAndView homeView() {
        ModelAndView model = new ModelAndView();

        model.setViewName("index");
        return model;
    }

}
