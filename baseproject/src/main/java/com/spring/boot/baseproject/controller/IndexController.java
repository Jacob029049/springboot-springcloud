package com.spring.boot.baseproject.controller;

import com.spring.boot.baseproject.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String homepage (Model model){
        User user = new User();
        user.setName("20190923");
        model.addAttribute(user);
        return "index";
    }
}
