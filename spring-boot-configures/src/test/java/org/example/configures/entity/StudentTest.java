package org.example.configures.entity;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class StudentTest {

    @Resource
    private Student student;

    @Resource
    private Dog dog;

    @Test
    void testStudent(){
        log.info(String.valueOf(dog));
        log.info(String.valueOf(student));
    }
}