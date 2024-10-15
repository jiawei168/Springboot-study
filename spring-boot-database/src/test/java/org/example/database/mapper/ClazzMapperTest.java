package org.example.database.mapper;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.database.entity.Clazz;
import org.example.database.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class ClazzMapperTest {
    @Resource
    private ClazzMapper clazzMapper;

    @Test
    void getClazzById() {
        Clazz clazz = clazzMapper.getClazzById(1);
        log.info("{},{}",clazz.getClazzId(),clazz.getClazzName());
        List<Student> students = clazz.getStudents();
        students.forEach(student -> log.info("{},{}",student.getStudentId(),student.getStudentName()));
    }

    @Test
    void getClazz(){
        Clazz clazz = clazzMapper.getClazz(1);
        log.info("班级名称：{}",clazz.getClazzName());
        log.info("任课老师：{}",clazz.getTeacher().getTeacherName());
        log.info("班级学生如下：");
        clazz.getStudents().forEach(student -> log.info("{},{}",student.getStudentName(),student.getHometown()));
    }
}