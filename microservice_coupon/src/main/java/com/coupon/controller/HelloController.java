package com.coupon.controller;

import com.coupon.service.CouponService;
import com.example.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {


    @Autowired
    private CouponService couponService;

    @GetMapping("/sayHello")
    public String sayHello(){
        return couponService.test();
    }
}
