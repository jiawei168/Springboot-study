package org.example.configures.entity;

import static org.junit.jupiter.api.Assertions.*;


import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class personTest {
    @Resource
    private person person;

    personTest() {
    }

    @Test
    public void test() {
        System.out.println(this.person);
    }
}
