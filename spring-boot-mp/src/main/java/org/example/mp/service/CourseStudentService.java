package org.example.mp.service;

import lombok.AllArgsConstructor;
import org.example.mp.entity.Course;
import org.example.mp.entity.Student;
import org.example.mp.mapper.CourseMapper;
import org.example.mp.mapper.CourseStudentMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class CourseStudentService {
    private final CourseStudentMapper courseStudentMapper;
    private final CourseMapper courseMapper;
    public Course getCourseWithStudents(Long courseId) {
        Course course = courseMapper.selectById(courseId);
        if (course != null) {
            List<Student> students = courseStudentMapper.selectStudentsByCourseId(courseId);
            course.setStudents(students);
        }
        return course;
    }
}
