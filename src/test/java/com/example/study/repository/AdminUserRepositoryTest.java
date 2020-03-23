package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.AdminUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@Slf4j
public class AdminUserRepositoryTest extends StudyApplicationTests {


    @Autowired
    private AdminUserRepository adminUserRepository;

    @Test
    public void adminUserTest() {

        AdminUser adminUser = new AdminUser();

        adminUser.setAccount("");
        adminUser.setStatus("");
        adminUser.setRole("");
        adminUser.setLastLoginAt(LocalDateTime.now());
        //adminUser.setLoginFailCount();
        adminUser.setRegisterdAt(LocalDateTime.now());
        adminUser.setCreatedAt(LocalDateTime.now());
        adminUser.setCreatedBy("Partner01");
        adminUserRepository.save(adminUser);
    }


    @Test
    public void adminUserReadTest() {
        System.out.println("ddddd"); //차후TEST

    }


}
