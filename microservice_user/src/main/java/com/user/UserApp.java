package com.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@MapperScan("com.user.mapper")
public class UserApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserApp.class);

    }
}
