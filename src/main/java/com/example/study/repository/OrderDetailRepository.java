package com.example.study.repository;

import com.example.study.model.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.Optional;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Id> {

    //Repository에 Id를 기준으로 찾으려고 하면 Optional 을 지정해줘서 찾으면 됨.
    Optional<OrderDetail> findById(Long Id);

}
