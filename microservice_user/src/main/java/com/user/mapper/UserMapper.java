package com.user.mapper;


import com.example.entity.user.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public List<User> selectAllUser();

    User queryUser(int id);
}
