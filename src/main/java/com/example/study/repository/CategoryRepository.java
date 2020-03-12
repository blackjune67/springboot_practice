package com.example.study.repository;

import com.example.study.model.entity.Category;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long > {

    //Optional<Category> findById(Long aLong);
    Optional<Category> findByType(String type);
}
