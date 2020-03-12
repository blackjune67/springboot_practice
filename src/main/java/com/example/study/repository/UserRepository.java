package com.example.study.repository;

import com.example.study.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //select * from user where account = ? << test03, test04

    //FirstBy 는 가장 최근의 것을 가져온다
    User findFirstByPhoneNumberOrderByIdDesc(String phoneNumber);


    //Optional<User> findByPhoneNumber(String phoneNumber);

}
