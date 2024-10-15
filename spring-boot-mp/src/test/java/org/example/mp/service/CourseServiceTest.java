package org.example.mp.service;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.mp.entity.Clazz;
import org.example.mp.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class CourseServiceTest {

    @Resource
    private CourseService courseService;
    @Test
    void getCourseWithStudent() {
        Course courseWithStudent = courseService.getCourseWithStudent(1L);
            log.info(courseWithStudent.toString());
    }
}