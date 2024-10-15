package org.example.mp.controller;

import lombok.AllArgsConstructor;
import org.example.mp.entity.Course;
import org.example.mp.entity.Student;
import org.example.mp.service.CourseStudentService;
import org.example.mp.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;
    private final CourseStudentService courseStudentService;

    /**
     * 获取学⽣及其课程信息
     */
    @GetMapping("/{id}/courses")
    public Student getStudentWithCourses(@PathVariable Long id) {
        return studentService.getStudentWithCourses(id);
    }
    @GetMapping("/{id}/students")
    public Course getCourseWithStudents(@PathVariable Long id) {
        return courseStudentService.getCourseWithStudents(id);
    }
}