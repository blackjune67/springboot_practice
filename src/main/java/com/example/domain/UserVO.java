package com.example.domain;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserVO {
    @NotEmpty
    @NotNull
    @Size(min=2, max=5)
    String id;

    @Size(min=3,max=5,message="3자이상 5자미만으로 작성해야 합니다.")
    String name;
}
