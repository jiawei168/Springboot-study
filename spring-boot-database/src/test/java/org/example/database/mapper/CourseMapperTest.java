package org.example.database.mapper;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.database.entity.Course;
import org.example.database.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class CourseMapperTest {
    @Resource
    private CourseMapper courseMapper;

    @Test
    void getCourse() {
        Course course = courseMapper.getCourse(20001);
        log.info("查询课程：{}", course);
        List<Student> students = course.getStudents();
        log.info("学生列表：");
        students.forEach(student -> log.info("{},{},{}", student.getStudentId(), student.getStudentName(), student.getHometown()));
    }
}