package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class OrderDetailRepositoryTest extends StudyApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;


    @Test
    public void create() {
        OrderDetail orderDetail = new OrderDetail();
        //주문일자
        orderDetail.setOrderAt(LocalDateTime.now());
        //어떤 사람?
        //orderDetail.setUserId(1L); //인덱스 1번의 아이디를 가진 아이디
        //어떤 아이템을 주문했는지
        //orderDetail.setItemId(6L);

        OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);

        Assert.assertNotNull(newOrderDetail);
    }
}