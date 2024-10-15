package org.example.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.example.mp.entity.Course;
import org.example.mp.entity.CourseStudent;
import org.example.mp.entity.Student;

import java.util.List;

public interface CourseStudentMapper extends BaseMapper<CourseStudent> {
    @Select("SELECT s.* FROM student s INNER JOIN course_student cs ON s.id = cs.student_id WHERE cs.course_id = #{courseId}")
    List<Student> selectStudentsByCourseId(Long courseId);
}
