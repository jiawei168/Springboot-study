package org.example.configures.entity;


import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FamilyTest {
    @Resource
    private Family family;

    FamilyTest() {
    }

    @Test
    public void test() {
        System.out.println(this.family);
    }
}
