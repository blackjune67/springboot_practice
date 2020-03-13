package com.example.study.repository;


import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Category;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.Optional;

/*
@RunWith(SpringRunner.class)
@SpringBootTest
위의 어노테이션을 붙여서 해도 테스트는 가능하다.
*/
public class CategoryRepositoryTest extends StudyApplicationTests {

    @Autowired
    private CategoryRepository categoryRepository;
    //한글 테스트
    @Test
    public void create() {
        String type = "Computer";
        String title = "컴퓨터";
        LocalDateTime createAt = LocalDateTime.now();
        String createBy = "AdminServer";

        Category category = new Category();
        category.setType(type);
        category.setTitle(title);
        category.setCreatedAt(createAt);
        category.setCreatedBy(createBy);

        Category newCategory = categoryRepository.save(category);

        Assert.assertNotNull(newCategory);
        Assert.assertEquals(newCategory.getType(), type);
        Assert.assertEquals(newCategory.getTitle(), title);
    }

    @Test
    public void read() {

        String type = "Computer";

        Optional<Category> optionalCategory = categoryRepository.findByType(type);

        //select * from category where type = "computer" 이런형식으로 많이 사용.

        optionalCategory.ifPresent(c -> {
            Assert.assertEquals(c.getType(), type);
            System.out.println(c.getId());
            System.out.println(c.getType());
            System.out.println(c.getTitle());
            System.out.println("깃터미널 한글 테스트!");
        });
    }





}
