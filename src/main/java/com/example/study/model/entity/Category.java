package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Category {

    private Long id;
    private String type;
    private String title;
    private LocalDateTime createdAt;
    private String createAt;
    private String createBy;
    private LocalDateTime createdBy;
    private String updateBy;


}
