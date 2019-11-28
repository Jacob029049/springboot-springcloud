package com.spring.boot.baseproject.controller;

import com.spring.boot.baseproject.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;

@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String homepage (Model model){
        boolean isOrderCarveUpAble = false;
        try {
            String carveupStartTime = "2019-09-25 00:00:00";
            String orderTime = "2019-09-24 00:00:00";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sdf.parse(orderTime).after(sdf.parse(carveupStartTime)));

        }catch (Exception e){
           e.printStackTrace();
        }

        return "index";
    }
}
