package com.user.controller;



import com.example.entity.user.User;
import com.example.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/queryUser")
    public User queryUser(User user){
        int id = user.getId();
        return userService.queryUser(id);

    }

}
