package com.example.service.user;



import com.example.entity.user.User;

import java.util.List;

public interface IUserService {


    String sayHello();

    List<User> selectAll();

    User queryUser(int id);

    int addUser(User user);

    int updateUser(User user);

    int delUser(User user);


}
