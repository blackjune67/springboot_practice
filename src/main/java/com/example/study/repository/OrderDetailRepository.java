package com.example.study.repository;

import com.example.study.model.entity.OrderDetail;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface OrderDetailRepository extends JpaAttributeConverter<OrderDetail, Id> {


}
