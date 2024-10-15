package org.example.mp.service;

import lombok.AllArgsConstructor;
import org.example.mp.entity.Clazz;
import org.example.mp.entity.Student;
import org.example.mp.entity.Teacher;
import org.example.mp.mapper.ClazzMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClazzService {
    private final ClazzMapper clazzMapper;
    /**
     * 根据班级ID获取班级和对应老师
     */
    public Clazz getClazzWithTeacher(Long clazzId) {
        Clazz clazz = clazzMapper.selectById(clazzId);
        if (clazz != null) {
            Teacher teacher = clazzMapper.selectTeacherByClazzId(clazz.getTeacherId());
            clazz.setTeacher(teacher);
        }
        return clazz;
    }
    public Clazz getClazzWithStudent(Long clazzId) {
        Clazz clazz = clazzMapper.selectById(clazzId);
        if (clazz != null) {
            List<Student> students = clazzMapper.selectStudentByClazzId(clazzId);
            Teacher teacher = clazzMapper.selectTeacherByClazzId(clazz.getTeacherId());
            clazz.setTeacher(teacher);
            clazz.setStudents(students);

        }
        return clazz;
    }
}