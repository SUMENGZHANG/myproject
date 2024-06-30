package com.user.service.impl;



import com.example.entity.user.User;
import com.user.mapper.UserMapper;
import com.example.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAllUser();
    }

    @Override
    public User queryUser(int id) {
        return userMapper.queryUser(id);

    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int delUser(User user) {
        return 0;
    }

    @Override
    public String sayHello() {
        System.out.println("has rpc service");
        return "this is rpc service - user service";
    }
}
