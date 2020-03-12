package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/*
 * @author hajune.choi
 * @brief user
 * @param
 * @return
 */
//@Table(name="user") //클래스 이름과 DB테이블의 이름이 동일하다면 굳이 @Table name 을 안해도 됨.
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
//@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTITY기본키 생성을 DB에 위임하는 방법
    private Long id;
    //@Column(name = "account") 위와 동일.
    //@Column(name = "account")
    private String account;
    //@Column(name = "email")
    private String password;
    private String status;
    private String email;
    //@Column(name = "phone_number")
    private String phoneNumber;
    //@Column(name = "created_at")
    private String registeredAt;
    private String unregisteredAt;
    private LocalDateTime createdAt;
    //@Column(name = "created_by")
    private String createdBy;
    //@Column(name = "updated_at")
    private LocalDateTime updatedAt;
    //@Column(name = "updated_by")
    private String updatedBy;

    // 1 : N
    // LAZY = 지연로딩, EAGER = 즉시로딩
    // LAZY = select * from item where id = ?
    // EAGER =  1 : 1 , LAZY = 1 : N
    /*@OneToMany(fetch = FetchType.LAZY, mappedBy = "user") // orderDetail 안의 user를 의미.
    private List<OrderDetail> orderDetailsList;*/

}
