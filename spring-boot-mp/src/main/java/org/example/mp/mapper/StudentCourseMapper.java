package org.example.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.mapper.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.mp.entity.Course;
import org.example.mp.entity.Student;
import org.example.mp.entity.StudentCourse;

import java.util.List;

public interface StudentCourseMapper extends BaseMapper<StudentCourse> {

    @Select("SELECT c.* FROM course c INNER JOIN student_course sc ON c.id = sc.course_id WHERE sc.student_id = #{studentId}")
    List<Course> selectCoursesByStudentId(Long studentId);

}
