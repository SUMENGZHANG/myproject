package com.coupon.service;

import com.example.entity.user.User;
import com.example.service.user.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponService {

    @DubboReference(url="dubbo://192.168.0.101:20880/com.example.service.user.IUserService")
    private IUserService userService;

    public String test(){
        return userService.sayHello();
    }
}
