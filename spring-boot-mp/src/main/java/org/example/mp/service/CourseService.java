package org.example.mp.service;

import lombok.AllArgsConstructor;
import org.example.mp.entity.Clazz;
import org.example.mp.entity.Course;
import org.example.mp.entity.Student;
import org.example.mp.mapper.CourseMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseService {
    private final CourseMapper courseMapper;

    public Course getCourseWithStudent(Long courseId) {
        Course course = courseMapper.selectById(courseId);
        if (course != null) {
            List<Student> students = courseMapper.selectStudentByCourseId(courseId);
            course.setStudents(students);
        }
        return course;
    }
}
