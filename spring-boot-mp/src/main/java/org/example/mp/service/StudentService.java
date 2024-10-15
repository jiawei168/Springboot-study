package org.example.mp.service;

import lombok.AllArgsConstructor;
import org.example.mp.entity.Course;
import org.example.mp.entity.Student;
import org.example.mp.mapper.CourseMapper;
import org.example.mp.mapper.CourseStudentMapper;
import org.example.mp.mapper.StudentCourseMapper;
import org.example.mp.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentMapper studentMapper;
    private final StudentCourseMapper studentCourseMapper;
    private final CourseStudentMapper courseStudentMapper;
    private final CourseMapper courseMapper;

    /**
     * 根据学⽣ID获取该学⽣的课程信息
     */
    public Student getStudentWithCourses(Long studentId) {
        Student student = studentMapper.selectById(studentId);
        if (student != null) {
            List<Course> courses = studentCourseMapper.selectCoursesByStudentId(studentId);
            student.setCourses(courses);
        }
        return student;
    }
    public Course getCourseWithStudents(Long courseId) {
        Course course = courseMapper.selectById(courseId);
        if (course != null) {
            List<Student> students = courseStudentMapper.selectStudentsByCourseId(courseId);
            course.setStudents(students);
        }
        return course;
    }
}
