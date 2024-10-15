package org.example.mp.service;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.mp.entity.Course;
import org.example.mp.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class StudentServiceTest {
    @Resource
    private StudentService studentService;
    @Autowired
    private CourseService courseService;

    @Test
    void getStudentWithCourses() {
        Student student = studentService.getStudentWithCourses(1L);
        log.info("{},{}", student.getId(), student.getName());
        student.getCourses().forEach(course -> log.info("{},{}", course.getId(), course.getName()));
    }
    @Test

    void getCourseWithStudents() {
        Course course = studentService.getCourseWithStudents(1L);
        log.info("{},{}", course.getId(), course.getName());
        course.getStudents().forEach(student -> log.info("{},{}", student.getId(), student.getName()));
    }

}