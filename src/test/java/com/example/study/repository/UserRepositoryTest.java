package com.example.study.repository;

import com.example.study.StudyApplicationTests;

import com.example.study.model.entity.Item;
import com.example.study.model.entity.User;
import org.junit.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends StudyApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {


    }

    @Test
    @Transactional
    public void read() {


    }

/*    @Test
    public void update() {
        Optional<User> user = userRepository.findById(1L);

        user.ifPresent(selectUser -> {
            selectUser.setAccount("PPP");
            selectUser.setUpdateAt(LocalDateTime.now());
            selectUser.setUpdateBy("update를 진행합니다. method()");

            userRepository.save(selectUser);
        });
    }

    @Test
    @Transactional
    public void delete() {
        Optional<User> user = userRepository.findById(2L);

        //테스트 코드
        Assert.assertTrue(user.isPresent()); //true
        user.ifPresent(selectUser -> userRepository.delete(selectUser));

        Optional<User> deleteUser = userRepository.findById(2L);
        Assert.assertFalse(deleteUser.isPresent()); //false
        if(deleteUser.isPresent()) {
            System.out.println("user DATA 가 있습니다." + deleteUser.get());
        } else {
            System.out.println("user DATA 가 없습니다.");
        }
    }*/
}