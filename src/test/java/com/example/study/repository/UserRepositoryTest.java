package com.example.study.repository;

import com.example.study.DemoApplicationTests;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends DemoApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        User user = new User();
        user.setAccount("TestUser03");
        user.setEmail("TestUser03@naver.com");
        user.setPhoneNumber("010-1234-1013");
        user.setCreateAt(LocalDateTime.now());
        user.setCreateBy("TestUser_Admin03");

        User newUser = userRepository.save(user);
        System.out.println("new_User03 : " + newUser);
    }

    @Test
    public void reade() {

    }

    public void update() {

    }

    public void delete() {

    }
}
