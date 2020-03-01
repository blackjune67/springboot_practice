package com.example.study.repository;

import com.example.study.model.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Id> {


}
