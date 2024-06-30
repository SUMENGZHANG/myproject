package com.example.entity.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


    private Integer id;
    private Integer age;
    private String nickName;
    private String headPic;


    private String email;
    private String phoneNumber;
    private String realName;
    private String passportNum;

    private Integer accountStatus;



}
