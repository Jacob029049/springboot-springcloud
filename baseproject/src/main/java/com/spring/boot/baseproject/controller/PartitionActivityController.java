package com.spring.boot.baseproject.controller;

import com.spring.boot.baseproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/partition/activity")
public class PartitionActivityController {

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public void insertPartitionActivity (){
        userServiceImpl.userInsert();
    }
}
