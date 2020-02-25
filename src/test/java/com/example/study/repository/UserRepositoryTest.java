package com.example.study.repository;

import com.example.study.DemoApplicationTests;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends DemoApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        User user = new User();
        user.setAccount("TestUser01");
        user.setEmail("TestUser01@naver.com");
        user.setPhoneNumber("010-1234-1013");
        user.setCreateAt(LocalDateTime.now());
        user.setCreateBy("TestUser_Admin01");

        User newUser = userRepository.save(user);
        System.out.println("new_User01 : " + newUser);
    }

    @Test
    public void read() {
        Optional<User> user = userRepository.findById(1L);
        user.ifPresent(selectUser -> System.out.println(">>>>> user : " + user));
    }

    public void update() {

    }

    public void delete() {

    }
}
