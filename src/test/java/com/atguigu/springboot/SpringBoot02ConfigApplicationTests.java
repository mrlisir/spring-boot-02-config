package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@SpringBootTest
public class SpringBoot02ConfigApplicationTests {
    @Autowired
    Person person;


    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
