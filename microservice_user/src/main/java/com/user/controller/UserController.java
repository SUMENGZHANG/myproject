package com.user.controller;


import com.user.beans.User;
import com.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private IUserService userService;
    @GetMapping("/test")
    public String test(){
        return "user service";
    }

    @GetMapping("/allUsers")
    public List<User> selectAll(){
        return userService.selectAll();
    }

}
