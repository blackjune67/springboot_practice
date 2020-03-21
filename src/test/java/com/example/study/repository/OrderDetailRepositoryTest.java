package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Optional;

import static javafx.scene.input.KeyCode.L;

public class OrderDetailRepositoryTest extends StudyApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;


    @Test
    public void create() {
        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setStatus("WAITING");
        orderDetail.setArrivalDate(LocalDateTime.now().plusDays(2));
        orderDetail.setQuantity(1);
        orderDetail.setTotalPrice(BigDecimal.valueOf(900000)); //valueOf
        orderDetail.setCreatedAt(LocalDateTime.now());
        orderDetail.setCreatedBy("Patner02");

        orderDetail.setItemId(7L);
        orderDetail.setOrderGroupId(1L);
        //주문일자
        //orderDetail.setOrderAt(LocalDateTime.now());
        //어떤 사람?
        //orderDetail.setUserId(1L); //인덱스 1번의 아이디를 가진 아이디
        //어떤 아이템을 주문했는지
        //orderDetail.setItemId(6L);
        OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);
        Assert.assertNotNull(newOrderDetail);
    }

    @Test
    public void read() {
        Long Id = 7L;
        Optional<OrderDetail> newOrderDetail = orderDetailRepository.findById();
        //Assert.assertNotNull(newOrderDetail);
        Assert.assertTrue(newOrderDetail.isPresent());

    }


}