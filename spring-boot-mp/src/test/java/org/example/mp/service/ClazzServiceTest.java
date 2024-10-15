package org.example.mp.service;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.mp.entity.Clazz;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class ClazzServiceTest {
    @Resource
    private ClazzService clazzService;
    @Test
    void getClazzWithTeacher() {
        Clazz clazzWithTeacher = clazzService.getClazzWithTeacher(1L);
        log.info(clazzWithTeacher.toString());
    }
    @Test
    void getClazzWithStudent() {
        Clazz clazzWithStudent = clazzService.getClazzWithStudent(1L);
        log.info(clazzWithStudent.toString());
    }
}